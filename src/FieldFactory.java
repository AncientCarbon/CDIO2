import java.util.HashMap;

public class FieldFactory {
    public enum SupportedLanguage {
        Danish,
        English
    }

    public static HashMap<Integer, Field> createFieldMap(SupportedLanguage language) {
        Field F2 = null;
        Field F3 = null;
        Field F4 = null;
        Field F5 = null;
        Field F6 = null;
        Field F7 = null;
        Field F8 = null;
        Field F9 = null;
        Field F10 = null;
        Field F11 = null;
        Field F12 = null;

        switch (language) {
            case Danish -> {
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
                                Du overtaler en soldat ved slottets port til at købe din mirakel-eliksir.
                                Den virker ikke, og han har ikke råd til at fodre sine børn nu.
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
            }
            case English -> {
                F2 = new Field("Tower", 250,
                        """
                                You pay 50 coins to get into Rundetårn.
                                It's boring, so you hit a guy and he gives you 300 coins to stop hitting him.
                                """);
                F3 = new Field("Crater", -100,
                        """
                                You find a very beautiful crater, and decide to take a picture.
                                Unfortunately, the camera isn't invented yet, so you sit down to cry.
                                A little boy comes over to you, kicks you, and takes 100 coins from you.
                                """);
                F4 = new Field("Palace Gates", 100,
                        """
                                You talk a soldier by the palace gates into buying a miracle potion from you.
                                It doesn't work, and now he doesn't have enough money to feed his children.
                                """);
                F5 = new Field("Cold Dessert", -20,
                        """
                                You arrive at the Cold Desert. It's cold, and you decide to buy a warm drink.
                                There's no stores in the cold desert, so you throw 20 coins on the ground in frustration.
                                """);
                F6 = new Field("Walled City", 180,
                        """
                                You plan a revolution in the Walled City, and gather all the citizens.
                                They give you everything they own, but it's all a scam so you run away with the money.
                                """);
                F7 = new Field("Monastery", 0,
                        """
                                You travel to the temple and pray to the gods instead of being productive.
                                """);
                F8 = new Field("Black Cave", -70,
                        """
                                You venture into a dark cave. It's dark,
                                so you pay the gods 70 coins to lead you out again.
                                """);
                F9 = new Field("Huts in the Mountain", 60,
                        """
                                You find some small huts in the mountains and decide to rob them.
                                They're not very rich.
                                """);
                F10 = new Field("The Werewall", -80,
                        """
                                You find a small fence. Suddenly, it's a full moon out and the fence
                                turns into a great wall. You're so shocked that you drop 80 coins.
                                """);
                F11 = new Field("The Pit", -50,
                        """
                                You stumble into a small hole dug by a brat from the city.
                                You smack him in the back of the head, but he takes 50 coins from you in the process.
                                """);
                F12 = new Field("The Goldmine", 650,
                        """
                                You decide that you don't want to play this game anymore, and venture home.
                                However, you find a new player on the way and takes more than half of his possessions.
                                Now you wanna play a little longer.
                                """);
            }
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
        return fieldMap;
    }
}
