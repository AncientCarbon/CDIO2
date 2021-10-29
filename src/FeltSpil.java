// Version 1.1.4

import java.util.*;

public class FeltSpil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Die terning1 = new Die(1, 6);
        Die terning2 = new Die(1, 6);

        System.out.println("""
                Begge spillere starter med en pengebeholdning på 1000kr.
                Slå med terningerne for at lande på et givent felt, med en given værdi,
                som både kan være positiv eller negativ.
                Spilleren der først når en pengebeholdning på 3000kr vinder.
                """); // Text block (forslået af java)

        System.out.print("Player 1 skriv dit navn: ");
        Player player1 = new Player(in.nextLine());
        System.out.print("Player 2 skriv dit navn: ");
        Player player2 = new Player(in.nextLine());

        HashMap<Integer, Field> fieldMap = FieldFactory.createFieldMap();

        int faceTotal;

        Player activePlayer = player1; // Variablen activePlayer har typen Player. Ligesom et navn har typen String...

        while (activePlayer.getBalance() < 3000) {

            System.out.print("Tryk 'enter' for at rulle med terningerne: Det er " + activePlayer.getName() + "'s tur");
            new Scanner(System.in).nextLine();

            faceTotal = terning1.roll() + terning2.roll();

            if (faceTotal < 2 || faceTotal > 12) {
                System.out.println("Der findes kun felter 2-12. Du har slået " + faceTotal);
            } else {
                Field field = fieldMap.get(faceTotal); // Ny variabel field som har typen Felt tilføjes
                activePlayer.addScore(field.getPoint());
                // Tilføjer et givent felt's point til den aktive spilleres pengebeholdning
                // vha. metoden addScore som er defineret i Player klassen
                System.out.println("\n" + field.getDescription());
                System.out.println("Du har fået " + field.getPoint() + " point.");
            }
            System.out.println(activePlayer.getName() + "'s nye score er: " + activePlayer.getBalance());

            if (activePlayer == player1) {
                activePlayer = player2; // Hvis activePlayer er player1, skift den aktive spiller til at være player2
                if (player1.getBalance() >= 3000) {
                    System.out.println(player1.getName() + " har vundet med en score på " + player1.getBalance() + " point.");
                    System.out.println(player2.getName() + " har tabt med en score på " + player2.getBalance() + " point.");
                    System.exit(0);
                } else if (faceTotal == 10) {
                    System.out.println("Da du er landet på " + fieldMap.get(10).getName() + " får du en ekstra tur!");
                    activePlayer = player1;
                }
            } else {
                activePlayer = player1; // Hvis activePlayer er player2, skift den aktive spiller til at være player1
                if (player2.getBalance() >= 3000) {
                    System.out.println(player2.getName() + " har vundet med en score på " + player2.getBalance() + " point.");
                    System.out.println(player1.getName() + " har tabt med en score på " + player1.getBalance() + " point.");
                    System.exit( 1);
                } else if (faceTotal == 10) {
                    System.out.println("Da du er landet på " + fieldMap.get(10).getName() + " får du en ekstra tur!");
                    activePlayer = player2;
                }
            }
        }
    }
}