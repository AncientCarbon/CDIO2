// Version 1.1.0

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

        Field F2 = new Field("Tower", 250,
                "Du betaler 50 mønter for at komme op i runde tårn. Det var kedeligt," +
                        " så du slår en mand, og han giver dig 300 mønter for at stoppe.");
        Field F3 = new Field("Crater", -100,
                """
                Du finder et meget flot krater, og beslutter dig for at tage et billede
                af det. Desværre er kameraet ikke opfundet endnu, så du sætter dig ned og
                græder. En lille dreng kommer hen og sparker til dig, og stjæler dine penge.""");
        Field F4 = new Field("Palace Gates", 100,
                "Du overtaler en soldat ved slottets port til at købe din mirakel-" +
                        "eliksir. Den virker ikke, og han har ikke råd til at fodre sine børn nu.");
        Field F5 = new Field("Cold Dessert", -20,
                "Du kommer ud i Den Kolde Ørken™. Den er kold™, og du beslutter dig for at" +
                        " købe en varm drik. Der er ingen butikker\ni Den Kolde Ørken™, så du smider" +
                        "20 mønter på jorden i frustration");
        Field F6 = new Field("Walled City", 180,
                "Du planlægger en revolution i Walled City™, og får alle de normale borgere" +
                        " til at donere alt hvad de ejer. Det er faktisk bare" +
                        "et scam, så du løber med pengene.");
        Field F7 = new Field("Monastery", 0,
                "Du tager til templet og beder til guderne i stedet for at " +
                        "være produktiv");
        Field F8 = new Field("Black Cave", -70,
                "Du tager ind i en mørk grotte. Den er mørk, så du betaler guderne " +
                        "70 mønter for at finde ud igen");
        Field F9 = new Field("Huts in the Mountain", 60,
                "Du finder nogle små hytter i bjergene, og beslutter dig for at røve dem." +
                        " De var ikke særligt rige");
        Field F10 = new Field("The Werewall", -80,
                "Du finder et lille hegn. Pludselig bliver det fuldmåne, og hegnet vokser" +
                        " sig til en mur. Du er så overrasket at du taber 80 mønter");
        Field F11 = new Field("The Pit", -50,
                "Du snubler i et lille hul en møgunge fra landsbyen gravede tidligere. Du " +
                        "smækker ham, og han stjæler 50 mønter fra dig.");
        Field F12 = new Field("The Goldmine", 650,
                "Du beslutter at du ikke gider spille det her spil længere, så du " +
                        "tager hjem. Dog finder du en ny spiller på vejen, og stjæler over " +
                        "halvdelen af hans penge. Nu vil du gerne spille lidt mere.");

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

            System.out.print("Tryk 'enter' for at rulle med terningerne: Det er " + activePlayer.getName() + "'s tur");
            new Scanner(System.in).nextLine();

            faceTotal = terning1.roll() + terning2.roll();

            if (faceTotal < 2 || faceTotal > 12) {
                System.out.println("Der findes kun felter 2-12. Du har slået " + faceTotal);
            } else {
                Field field = fieldMap.get(faceTotal); // Ny variabel field som har typen Felt tilføjes
                activePlayer.addScore(field.point);
                // Tilføjer et givent felt's point til den aktive spilleres pengebeholdning
                // vha. metoden addScore som er defineret i Player klassen
                System.out.println("\n" + field.description);
                System.out.println("Du har fået " + field.point + " point.");
            }
            System.out.println(activePlayer.getName() + "'s nye score er: " + activePlayer.getBalance());

            if (activePlayer == player1) {
                activePlayer = player2; // Hvis activePlayer er player1, skift den aktive spiller til at være player2
                if (player1.getBalance() >= 3000) {
                    System.out.println(player1.getName() + " har vundet med en score på " + player1.getBalance() + " point.");
                    System.out.println(player2.getName() + " har tabt med en score på " + player2.getBalance() + " point.");
                    System.exit(0);
                } else if (faceTotal == 10) {
                    System.out.println("Da du er landet på " + F10.name + " får du en ekstra tur!");
                    activePlayer = player1;
                }
            } else {
                activePlayer = player1; // Hvis activePlayer er player2, skift den aktive spiller til at være player1
                if (player2.getBalance() >= 3000) {
                    System.out.println(player2.getName() + " har vundet med en score på " + player2.getBalance() + " point.");
                    System.out.println(player1.getName() + " har tabt med en score på " + player1.getBalance() + " point.");
                    System.exit( 1);
                } else if (faceTotal == 10) {
                    System.out.println("Da du er landet på " + F10.name + " får du en ekstra tur!");
                    activePlayer = player2;
                }
            }
        }
    }
}