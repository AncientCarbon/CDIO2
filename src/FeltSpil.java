// Version 2.0.0

import java.util.*;

public class FeltSpil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        Die terning1 = new Die(1, 6);
        Die terning2 = new Die(1, 6);

        System.out.print("Type '1' for danish, '2' for english: ");
        int language = in.nextInt();
        System.out.println();

        while (language != 1 && language != 2) {
            System.out.print("Please enter '1' for Danish, or '2' for English: ");
            System.out.println();
            language = in.nextInt();
        }

        if (language == 1) {
            System.out.println("""
                    Begge spillere starter med en pengebeholdning på 1000kr.
                    Slå med terningerne for at lande på et givent felt, med en given værdi,
                    som både kan være positiv eller negativ.
                    Spilleren der først når en pengebeholdning på 3000kr vinder.
                    """); // Text block (forslået af java)
        } else {
            System.out.println("""
                    Both players start with a balance of 1000 DKK.
                    Roll the dice to land on a field with a given value.
                    This value could both be positive and negative.
                    The first player to reach a balance of 3000 DKK wins.
                        """); // Text block (forslået af java)
        }
        if (language == 1){
            System.out.print("Player 1 skriv dit navn: ");
        } else if (language == 2) System.out.print("Player 1 write your name: ");

        Player player1 = new Player(scanner.nextLine());

        if (language == 1){
            System.out.print("Player 2 skriv dit navn: ");
        } else if (language == 2) System.out.print("Player 2 write your name: ");
        Player player2 = new Player(scanner.nextLine());

        Field F2;
        Field F3;
        Field F4;
        Field F5;
        Field F6;
        Field F7;
        Field F8;
        Field F9;
        Field F10;
        Field F11;
        Field F12;

        if (language == 1) {
            F2 = new Field("Tower", 250,
                    """
                            Du betaler 50 mønter for at komme op i runde tårn. Det var kedeligt,
                            så du slår en mand, og han giver dig 300 mønter for at stoppe.
                            """);
            F3 = new Field("Crater", -100,
                    """
                            Du finder et meget flot krater, og beslutter dig for at tage et billede
                            af det. Desværre er kameraet ikke opfundet endnu, så du sætter dig ned og
                            græder. En lille dreng kommer hen og sparker til dig, og stjæler dine penge.""");
            F4 = new Field("Palace Gates", 100,
                    """
                            Du overtaler en soldat ved slottets port til at købe din mirakel-
                            eliksir. Den virker ikke, og han har ikke råd til at fodre sine børn nu.
                            """);
            F5 = new Field("Cold Dessert", -20,
                    """
                            Du kommer ud i Den Kolde Ørken™. Den er kold™, og du beslutter dig for at
                            købe en varm drik. Der er ingen butikker i Den Kolde Ørken™, så du smider
                            20 mønter på jorden i frustration
                            """);
            F6 = new Field("Walled City", 180,
                    """
                            Du planlægger en revolution i Walled City™, og får alle de normale borgere
                            til at donere alt hvad de ejer. Det er faktisk bare
                            et scam, så du løber med pengene.
                            """);
            F7 = new Field("Monastery", 0,
                    """
                            Du tager til templet og beder til guderne i stedet for at
                            være produktiv
                            """);
            F8 = new Field("Black Cave", -70,
                    """
                            Du tager ind i en mørk grotte. Den er mørk, så du betaler guderne
                            70 mønter for at finde ud igen
                            """);
            F9 = new Field("Huts in the Mountain", 60,
                    """
                            Du finder nogle små hytter i bjergene, og beslutter dig for at røve dem.
                            De var ikke særligt rige
                            """);
            F10 = new Field("The Werewall", -80,
                    """
                            Du finder et lille hegn. Pludselig bliver det fuldmåne, og hegnet vokser
                            sig til en mur. Du er så overrasket at du taber 80 mønter
                            """);
            F11 = new Field("The Pit", -50,
                    """
                            Du snubler i et lille hul en møgunge fra landsbyen gravede tidligere. Du
                            smækker ham, og han stjæler 50 mønter fra dig.
                            """);
            F12 = new Field("The Goldmine", 650,
                    """
                            Du beslutter at du ikke gider spille det her spil længere, så du
                            tager hjem. Dog finder du en ny spiller på vejen, og stjæler over
                            halvdelen af hans penge. Nu vil du gerne spille lidt mere.
                            """);
        } else {
            F2 = new Field("Tower", 250,
                    """
                            You pay 50 coins to get into Runde Tårn. It's boring, so you
                            punch a man and he gives you 300 coins to stop.
                            """);
            F3 = new Field("Crater", -100,
                    """
                            You find a very beautiful crater and decide to take a picture. Unfortunately,
                            the camera hasn't been invented yet, so you sit down to cry. A small boy
                            comes over, kicks you, and steals your money.
                            """);
            F4 = new Field("Palace Gates", 100,
                    """
                            You convince a soldier by the Palace Gates to buy your miracle potion.
                            It doesn't work, and now he can't afford to feed his children.
                            """);
            F5 = new Field("Cold Dessert", -20,
                    """
                            You arrive at the Cold Desert™. It's Cold™, so you decide to buy a warm drink.
                            Unforunately, you can't find a Café in the Cold Desert™, so you throw 20
                            coins on the ground in frustration.
                            """);
            F6 = new Field("Walled City", 180,
                    """
                            You plan a revolution in the Walled City™, and get every oppressed citizen
                            to donate everything they own. It's all a scam, and you run away with
                            the money.
                            """);
            F7 = new Field("Monastery", 0,
                    """
                            You travel to the Monastery™ and pray to the gods instead of
                            being productive
                            """);
            F8 = new Field("Black Cave", -70,
                    """
                            Du tager ind i en mørk grotte. Den er mørk, så du betaler guderne
                            70 mønter for at finde ud igen
                            You venture into a Dark Cave™. It's very dark, so you pay the gods
                            70 coins to lead you out.
                            """);
            F9 = new Field("Huts in the Mountain", 60,
                    """
                            You find some small huts in the mountains and decide to rob them.
                            They weren't very rich.
                            """);
            F10 = new Field("The Werewall", -80,
                    """
                            You find a small fence. It's suddenly a full moon, and the fence evolves
                            into a wall. You're so surprised that you drop 80 coins.
                            """);
            F11 = new Field("The Pit", -50,
                    """
                            You stumble in a small hole a brat from the village dug earlier. You
                            smack him, and he steals 50 coins from you.
                            """);
            F12 = new Field("The Goldmine", 650,
                    """
                            You decide you don't want to play this game longer, so you head home.
                            You find a new player on the way and steals half of their money.
                            Now you don't mind playing a little longer.
                            """);
        }

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

        while (activePlayer.getBalance() < 3000) {

            if (language == 1) {
                System.out.print("Tryk 'enter' for at rulle med terningerne. Det er " + activePlayer.getName() + "'s tur");
            } else {
                System.out.print("Press 'enter' to roll the dice. It's " + activePlayer.getName() + "'s turn");
            }

            new Scanner(System.in).nextLine();

            faceTotal = terning1.roll() + terning2.roll();

            if (faceTotal < 2 || faceTotal > 12) {
                if (language == 1) {
                    System.out.println("Der findes kun felter 2-12. Du har slået " + faceTotal);
                }
                else System.out.println("There's only fields 2-12. You rolled " + faceTotal);

            } else {
                Field field = fieldMap.get(faceTotal); // Ny variabel field som har typen Felt tilføjes
                activePlayer.addScore(field.getPoint());
                // Tilføjer et givent felt's point til den aktive spilleres pengebeholdning
                // vha. metoden addScore som er defineret i Player klassen
                System.out.println("\n" + field.getDescription());
                if (language == 1) {
                    System.out.println("Du har fået " + field.getPoint() + " point.");
                }
                else System.out.println("You got " + field.getPoint() + " points.");
            }
            if (language == 1) {
                System.out.println(activePlayer.getName() + "'s nye score er: " + activePlayer.getBalance());
            }
            else System.out.println(activePlayer.getName() + "'s new score is: " + activePlayer.getBalance());

            if (activePlayer == player1) {
                activePlayer = player2; // Hvis activePlayer er player1, skift den aktive spiller til at være player2
                if (player1.getBalance() >= 3000) {
                    if (language == 1) {
                        System.out.println(player1.getName() + " har vundet med en score på " + player1.getBalance() + " point.");
                        System.out.println(player2.getName() + " har tabt med en score på " + player2.getBalance() + " point.");
                    }
                    else{
                        System.out.println(player1.getName() + " has won with a score of " + player1.getBalance() + " points.");
                        System.out.println(player2.getName() + " has lost with a score of " + player2.getBalance() + " points.");
                    }
                        System.exit(0);
                } else if (faceTotal == 10) {
                    if (language == 1) {
                        System.out.println("Da du er landet på " + F10.getName() + " får du en ekstra tur!");
                    }
                    else System.out.println("You landed on " + F10.getName() + ", so you get an extra turn!");
                    activePlayer = player1;
                }
            } else {
                activePlayer = player1; // Hvis activePlayer er player2, skift den aktive spiller til at være player1
                if (player2.getBalance() >= 3000) {
                    if (language == 1) {
                        System.out.println(player2.getName() + " har vundet med en score på " + player2.getBalance() + " point.");
                        System.out.println(player1.getName() + " har tabt med en score på " + player1.getBalance() + " point.");
                    }
                    else{
                        System.out.println(player2.getName() + " has won with a score of " + player2.getBalance() + " points.");
                        System.out.println(player1.getName() + " has lost with a score of " + player2.getBalance() + " points.");
                    }
                    System.exit(1);
                } else if (faceTotal == 10) {
                    if (language == 1) {
                        System.out.println("Da du er landet på " + F10.getName() + " får du en ekstra tur!");
                    }
                    else System.out.println("You landed on " + F10.getName() + ", so you get an extra turn!");
                    activePlayer = player2;
                }
            }
        }
    }
}