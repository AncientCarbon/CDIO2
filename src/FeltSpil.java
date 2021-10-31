// Version 2.0.0

import java.util.*;

public class FeltSpil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Die terning1 = new Die(1, 6);
        Die terning2 = new Die(1, 6);

        System.out.println("For dansk skriv da.\nFor english type en.");
        String languageChoice = in.nextLine();
        while (!languageChoice.equals("da") && !languageChoice.equals("en")) {
            System.out.println("Dette input eksisterer ikke. Venligst vælg da (dansk) eller en (engelsk)");
            languageChoice = in.nextLine();
        }
        SupportedLanguage language = languageChoice.equals("da")
                ? SupportedLanguage.DANISH : SupportedLanguage.ENGLISH; // Accesses enum constants with the dot syntax

        HashMap<String, String> languageMap = LanguageFactory.createLanguageMap(language);
        HashMap<Integer, Field> fieldMap = FieldFactory.createFieldMap(languageMap);

        System.out.println(languageMap.get("Rules")); // Text block (forslået af java)

        System.out.printf(languageMap.get("inputPlayerName"), 1);
        Player player1 = new Player(in.nextLine());
        System.out.printf(languageMap.get("inputPlayerName"), 2);
        Player player2 = new Player(in.nextLine());

        int faceTotal;

        Player activePlayer = player1; // Variablen activePlayer har typen Player. Ligesom et navn har typen String...

        while (activePlayer.getBalance() < 3000) {

            System.out.printf(languageMap.get("rollDice"), activePlayer.getName());
            new Scanner(System.in).nextLine();

            faceTotal = terning1.roll() + terning2.roll();

            if (faceTotal < 2 || faceTotal > 12) {
                System.out.printf((languageMap.get("errorNoField")) + "\n", faceTotal);
            } else {
                Field field = fieldMap.get(faceTotal); // Ny variabel field som har typen Felt tilføjes
                activePlayer.addScore(field.getPoint());
                // Tilføjer et givent felt's point til den aktive spilleres pengebeholdning
                // vha. metoden addScore som er defineret i Player klassen
                System.out.printf(languageMap.get("fieldLandedOn") + "\n", field.getDescription(), field.getName(), field.getPoint());
            }
            System.out.printf(languageMap.get("newScore") + "\n", activePlayer.getName(), activePlayer.getBalance());

            if (activePlayer == player1) {
                activePlayer = player2; // Hvis activePlayer er player1, skift den aktive spiller til at være player2
                if (player1.getBalance() >= 3000) {
                    System.out.printf(languageMap.get("gameResult") + "\n", player1.getName(), player1.getBalance(), player2.getName(), player2.getBalance());
                    System.exit(0);
                } else if (faceTotal == 10) {
                    System.out.printf(languageMap.get("SpecialF10") + "\n", fieldMap.get(10).getName());
                    activePlayer = player1;
                }
            } else {
                activePlayer = player1; // Hvis activePlayer er player2, skift den aktive spiller til at være player1
                if (player2.getBalance() >= 3000) {
                    System.out.printf(languageMap.get("gameResult"), player2.getName(), player2.getBalance(), player1.getName(), player1.getBalance());
                    System.exit( 0);
                } else if (faceTotal == 10) {
                    System.out.printf(languageMap.get("SpecialF10") + "\n", fieldMap.get(10).getName());
                    activePlayer = player2;
                }
            }
        }
    }
}