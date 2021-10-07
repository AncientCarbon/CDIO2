// Version 0.1.1

import java.util.*;

public class FeltSpil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Die terning1 = new Die(1, 6);
        Die terning2 = new Die(1, 6);

        System.out.println("""
                Begge spillere starter med en pengebeholdning på 1000kr.
                Slå med terningerne for at lande på et givent felt, med en given værdi, som både kan være positiv eller negativ.
                Spilleren der når en pengebeholdning på 3000kr vinder
                """); // Text block (forslået af java)
        System.out.print("Player 1 skriv dit navn: ");
        Player player1 = new Player(in.nextLine());
        System.out.print("Player 2 skriv dit navn: ");
        Player player2 = new Player(in.nextLine());

        Field F2 = new Field("Tower", 250);
            F2.description = "describe this field";
        Field F3 = new Field("Crater", -100);
            F3.description = "describe this field";
        Field F4 = new Field("Palace Gates", 100);
            F4.description = "describe this field";
        Field F5 = new Field("Cold Dessert", -20);
            F5.description = "describe this field";
        Field F6 = new Field("Walled City", 180);
            F6.description = "describe this field";
        Field F7 = new Field("Monastery", 0);
            F7.description = "describe this field";
        Field F8 = new Field("Black Cave", -70);
            F8.description = "describe this field";
        Field F9 = new Field("Huts in the Mountain", 60);
            F9.description = "describe this field";
        Field F10 = new Field("The Werewall", -80); // (Werewolf-Wall)
            F10.description = "describe this field";
        Field F11 = new Field("The Pit", -50);
            F11.description = "describe this field";
        Field F12 = new Field("The Goldmine", 650);
            F12.description = "Du har fundet guld i bjergene og sælger det for 650, du er rig!";

        HashMap<Integer, Field> fieldMap = new HashMap<>();
        // Laver et HashMap. HashMap-navnet er fieldMap
        // HashMap Key skal en int og værdien skal være et felt-objekt som er dannet herover
        fieldMap.put(2, F2); // Har en key = 2, og en værdi som her peger på objektet F2S
        // Indsætter værdier i Map. Metoden put() indsætter elementer i Map
        fieldMap.put(3, F3);
        fieldMap.put(4, F4);
        fieldMap.put(5, F5);
        fieldMap.put(6, F6);
        fieldMap.put(7, F7);
        fieldMap.put(8, F8);
        fieldMap.put(9, F9);
        fieldMap.put(10, F10);
        fieldMap.put(11, F11);
        fieldMap.put(12, F12);

        int faceTotal;

        Player activePlayer = player1; // Variablen activePlayer har typen Player. Ligesom et navn har typen String...
        while (activePlayer.balance < 3000) {

            System.out.print("Tryk 'enter' for at rulle med terningerne: Det er " + activePlayer.name + "'s tur");
            new Scanner(System.in).nextLine();

            faceTotal = terning1.roll() + terning2.roll();

            if (faceTotal < 2 || faceTotal > 12) {
                System.out.println("Der findes kun felter 2-12. Du har slået " + faceTotal);
            } else {
                Field field = fieldMap.get(faceTotal); // Ny variabel field som har typen Felt tilføjes
                activePlayer.addScore(field);
                // Tilføjer et givent felt's point til den aktive spilleres pengebeholdning
                // vha. metoden addScore som er defineret i Player klassen
                System.out.println(field.description);
                System.out.println("\nDu er landet på " + field.name + ", og du har fået " + field.point + " point.");
            }
            System.out.println(activePlayer.name + "'s nye score er: " + activePlayer.balance);

            if (activePlayer == player1) {
                activePlayer = player2; // Hvis activePlayer er player1, skift den aktive spiller til at være player2
                if (player1.balance >= 3000) {
                    System.out.println(player1.name + " har vundet med en score på " + player1.balance + " point.");
                    System.out.println(player2.name + " har tabt med en score på " + player2.balance + " point.");
                    System.exit(0);
                }
                else if (faceTotal == 10){
                    System.out.println("Da du er landet på " + F10.name + " får du en ekstra tur!");
                    activePlayer = player1;
                }
            } else {
                activePlayer = player1; // Hvis activePlayer er player2, skift den aktive spiller til at være player1
                if (player2.balance >= 3000) {
                    System.out.println(player2.name + " har vundet med en score på " + player2.balance + " point.");
                    System.out.println(player1.name + " har tabt med en score på " + player1.balance + " point.");
                    System.exit(1);
                }
                else if (faceTotal == 10){
                    System.out.println("Da du er landet på " + F10.name + " får du en ekstra tur!");
                    activePlayer = player2;
                }
            }
        }
    }
}