// Version 0.0.6

import java.util.*;
public class FeltSpil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Indtast terning 1's MIN og MAX værdier " +
                "(separer værdierne med et mellemrum eller et linjeskift)");
        Die terning1 = new Die(in.nextInt(), in.nextInt());
        System.out.println("Indtast terning 2's MIN og MAX værdier " +
                "(separer værdierne med et mellemrum eller et linjeskift)");
        Die terning2 = new Die(in.nextInt(), in.nextInt());
        System.out.println(terning1.roll());
        System.out.println(terning2.roll());

        Scanner input = new Scanner(System.in);
        System.out.print("Player 1 skriv dit navn: ");
        String name1 = input.nextLine();
        Player player1 = new Player(name1);
        System.out.print("Player 2 skriv dit navn: ");
        String name2 = input.nextLine();
        Player player2 = new Player(name2);

        System.out.println("De to spillere hedder " + player1.name + " og " + player2.name);


        Felt F2 = new Felt ("Tower", 250); // Tower
        Felt F3 = new Felt ("Crater", -100); // Crater
        Felt F4 = new Felt ("Palace Gates", 100); // Palace Gates
        Felt F5 = new Felt ("Cold Dessert", -20); // Cold Dessert
        Felt F6 = new Felt ("Walled City", 180); // Walled City
        Felt F7 = new Felt ("Monastery", 0); // Monastery
        Felt F8 = new Felt ("Black Cave", -70); // Black Cave
        Felt F9 = new Felt ("Huts in the Mountain", 60); // Huts in the Mountain
        Felt F10 = new Felt ("The Werewall", -80); // The Werewall (Werewolf-Wall)
        Felt F11 = new Felt ("The Pit", -50); // The Pit
        Felt F12 = new Felt ("The Goldmine", 650); // The Goldmine



    }
}