// Version 0.0.8

import java.util.*;
public class FeltSpil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Die terning1 = new Die(1,6);
        Die terning2 = new Die(1, 6);

        System.out.print("Player 1 skriv dit navn: ");
        Player player1 = new Player(in.nextLine());
        System.out.print("Player 2 skriv dit navn: ");
        Player player2 = new Player(in.nextLine());

        player1.balance = 1000;
        player2.balance = 1000;

        int faceTotal;

        Felt F2 = new Felt ("Tower", 250, 2); // Tower
        Felt F3 = new Felt ("Crater", -100, 3); // Crater
        Felt F4 = new Felt ("Palace Gates", 100, 4); // Palace Gates
        Felt F5 = new Felt ("Cold Dessert", -20, 5); // Cold Dessert
        Felt F6 = new Felt ("Walled City", 180, 6); // Walled City
        Felt F7 = new Felt ("Monastery", 0, 7); // Monastery
        Felt F8 = new Felt ("Black Cave", -70, 8); // Black Cave
        Felt F9 = new Felt ("Huts in the Mountain", 60, 9); // Huts in the Mountain
        Felt F10 = new Felt ("The Werewall", -80, 10); // The Werewall (Werewolf-Wall)
        Felt F11 = new Felt ("The Pit", -50, 11); // The Pit
        Felt F12 = new Felt ("The Goldmine", 650, 12); // The Goldmine


        while (player1.balance < 3000 && player2.balance < 3000){

            System.out.print("\n"+ player1.name + "'s tur. Tryk 'enter' for at rulle med terningerne:");
            new Scanner(System.in).nextLine();
            System.out.println();

            faceTotal = terning1.roll() + terning2.roll();

            if (faceTotal == F2.felt){
                player1.addScore(F2);
                System.out.println("Du er landet på " + F2.name + ", og du har fået " + F2.point + " point.");
            }
            else if (faceTotal == F3.felt){
                player1.addScore(F3);
                System.out.println("Du er landet på " + F3.name + ", og du har fået " + F3.point + " point.");
            }
            else if (faceTotal == F4.felt){
                player1.addScore(F4);
                System.out.println("Du er landet på " + F4.name + ", og du har fået " + F4.point + " point.");
            }
            else if (faceTotal == F5.felt){
                player1.addScore(F5);
                System.out.println("Du er landet på " + F5.name + ", og du har fået " + F5.point + " point.");
            }
            else if (faceTotal == F6.felt){
                player1.addScore(F6);
                System.out.println("Du er landet på " + F6.name + ", og du har fået " + F6.point + " point.");
            }
            else if (faceTotal == F7.felt){
                player1.addScore(F7);
                System.out.println("Du er landet på " + F7.name + ", og du har fået " + F7.point + " point.");
            }
            else if (faceTotal == F8.felt){
                player1.addScore(F8);
                System.out.println("Du er landet på " + F8.name + ", og du har fået " + F8.point + " point.");
            }
            else if (faceTotal == F9.felt){
                player1.addScore(F9);
                System.out.println("Du er landet på " + F9.name + ", og du har fået " + F9.point + " point.");
            }
            else if (faceTotal == F10.felt){
                player1.addScore(F10);
                System.out.println("Du er landet på " + F10.name + ", og du har fået " + F10.point + " point.");
            }
            else if (faceTotal == F11.felt){
                player1.addScore(F11);
                System.out.println("Du er landet på " + F11.name + ", og du har fået " + F11.point + " point.");
            }
            else if (faceTotal == F12.felt){
                player1.addScore(F12);
                System.out.println("Du er landet på " + F12.name + ", og du har fået " + F12.point + " point.");
            }
            else {
                System.out.println("Der findes kun felter 2-12. Du har slået " + faceTotal);
            }
            System.out.println(player1.name + "'s nye score er: " + player1.balance);



            //player 2's tur
            System.out.println("\n" + player2.name + "'s tur. Tryk enter for at rulle med terningerne");
            new Scanner(System.in).nextLine();
            System.out.println();

            faceTotal = terning1.roll() + terning2.roll();

            if (faceTotal == F2.felt){
                player2.balance += F2.point;
                System.out.println("Du er landet på " + F2.name + ", og du har fået " + F2.point + " point.");
            }
            else if (faceTotal == F3.felt){
                player2.balance += F3.point;
                System.out.println("Du er landet på " + F3.name + ", og du har fået " + F3.point + " point.");
            }
            else if (faceTotal == F4.felt){
                player2.balance += F4.point;
                System.out.println("Du er landet på " + F4.name + ", og du har fået " + F4.point + " point.");
            }
            else if (faceTotal == F5.felt){
                player2.balance += F5.point;
                System.out.println("Du er landet på " + F5.name + ", og du har fået " + F5.point + " point.");
            }
            else if (faceTotal == F6.felt){
                player2.balance += F6.point;
                System.out.println("Du er landet på " + F6.name + ", og du har fået " + F6.point + " point.");
            }
            else if (faceTotal == F7.felt){
                player2.balance += F7.point;
                System.out.println("Du er landet på " + F7.name + ", og du har fået " + F7.point + " point.");
            }
            else if (faceTotal == F8.felt){
                player2.balance += F8.point;
                System.out.println("Du er landet på " + F8.name + ", og du har fået " + F8.point + " point.");
            }
            else if (faceTotal == F9.felt){
                player2.balance += F9.point;
                System.out.println("Du er landet på " + F9.name + ", og du har fået " + F9.point + " point.");
            }
            else if (faceTotal == F10.felt){
                player2.balance += F10.point;
                System.out.println("Du er landet på " + F10.name + ", og du har fået " + F10.point + " point.");
            }
            else if (faceTotal == F11.felt){
                player2.balance += F11.point;
                System.out.println("Du er landet på " + F11.name + ", og du har fået " + F11.point + " point.");
            }
            else if (faceTotal == F12.felt){
                player2.balance += F12.point;
                System.out.println("Du er landet på " + F12.name + ", og du har fået " + F12.point + " point.");
            }
            else {
                System.out.println("Der findes kun felter 2-12. Du har slået " + faceTotal);
            }
            System.out.println(player2.name + "'s nye score er: " + player2.balance);
        }

        if (player1.balance > 3000 && player2.balance > 3000){
            System.out.println("Tillykke " + player1.name + " og " + player2.name + ", i har begge vundet! Den sidste score er:\n" + player1.name + ":" + player1.balance + "\n" + player2.name + ":" + player2.balance);
        }
        else if (player2.balance > 3000){
            System.out.println("Tillykke " + player2.name + "! Du vandt, og den " +
                    "sidste score blev:\n" +player1.name + ":" + player1.balance +
                    "\n" + player2.name + ":" + player2.balance);
        }
        else if (player1.balance > 3000){
            System.out.println("Tillykke" + player1.name + "! Du vandt, og den " +
                    "sidste score blev:\n" +player1.name + ":" + player1.balance +
                    "\n" + player2.name + ":" + player2.balance);
        }
    }
}