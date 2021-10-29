import java.util.HashMap;

public class FieldFactory {
    public static HashMap<Integer, Field> createFieldMap() {
        Field F2 = new Field("Tower", 250,
                """
                        Du betaler 50 mønter for at komme op i runde tårn. Det var kedeligt," +
                        " så du slår en mand, og han giver dig 300 mønter for at stoppe.
                        """);
        Field F3 = new Field("Crater", -100,
                """
                        Du finder et meget flot krater, og beslutter dig for at tage et billede
                        af det. Desværre er kameraet ikke opfundet endnu, så du sætter dig ned og
                        græder. En lille dreng kommer hen og sparker til dig, og stjæler dine penge.""");
        Field F4 = new Field("Palace Gates", 100,
                """
                        Du overtaler en soldat ved slottets port til at købe din mirakel-" +
                        "eliksir. Den virker ikke, og han har ikke råd til at fodre sine børn nu.
                        """);
        Field F5 = new Field("Cold Dessert", -20,
                """
                        Du kommer ud i Den Kolde Ørken™. Den er kold™, og du beslutter dig for at" +
                        " købe en varm drik. Der er ingen butikker i Den Kolde Ørken™, så du smider " +
                        "20 mønter på jorden i frustration
                        """);
        Field F6 = new Field("Walled City", 180,
                """
                        Du planlægger en revolution i Walled City™, og får alle de normale borgere" +
                        " til at donere alt hvad de ejer. Det er faktisk bare" +
                        "et scam, så du løber med pengene.
                        """);
        Field F7 = new Field("Monastery", 0,
                """
                        Du tager til templet og beder til guderne i stedet for at " +
                        "være produktiv
                        """);
        Field F8 = new Field("Black Cave", -70,
                """
                        Du tager ind i en mørk grotte. Den er mørk, så du betaler guderne " +
                        "70 mønter for at finde ud igen
                        """);
        Field F9 = new Field("Huts in the Mountain", 60,
                """
                        Du finder nogle små hytter i bjergene, og beslutter dig for at røve dem." +
                        "De var ikke særligt rige
                        """);
        Field F10 = new Field("The Werewall", -80,
                """
                        Du finder et lille hegn. Pludselig bliver det fuldmåne, og hegnet vokser" +
                        " sig til en mur. Du er så overrasket at du taber 80 mønter
                        """);
        Field F11 = new Field("The Pit", -50,
                """
                        Du snubler i et lille hul en møgunge fra landsbyen gravede tidligere. Du " +
                        "smækker ham, og han stjæler 50 mønter fra dig.
                        """);
        Field F12 = new Field("The Goldmine", 650,
                """
                        Du beslutter at du ikke gider spille det her spil længere, så du " +
                        "tager hjem. Dog finder du en ny spiller på vejen, og stjæler over " +
                        "halvdelen af hans penge. Nu vil du gerne spille lidt mere.
                        """);

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
        return fieldMap;
    }
}
