import java.util.HashMap;

public class LanguageFactory {
    public static HashMap<String, String> createLanguageMap(SupportedLanguage language) {
        HashMap<String, String> languageMap = new HashMap<>();

        switch (language) {
            case Danish -> {
                // Fields
                languageMap.put("Tower",
                        """
                                Du betaler 50 mønter for at komme op i runde tårn. Det var kedeligt,
                                så du slår en mand, og han giver dig 300 mønter for at stoppe.""");
                languageMap.put("Crater",
                        """
                                Du finder et meget flot krater, og beslutter dig for at tage et billede
                                af det. Desværre er kameraet ikke opfundet endnu, så du sætter dig ned og
                                græder. En lille dreng kommer hen og sparker til dig, og stjæler dine penge.""");
                languageMap.put("Palace Gates",
                        """
                                Du overtaler en soldat ved slottets port til at købe din mirakel-eliksir.
                                Den virker ikke, og han har ikke råd til at fodre sine børn nu.""");
                languageMap.put("Cold Dessert",
                        """
                                Du kommer ud i Den Kolde Ørken. Den er kold, og du beslutter dig for at
                                købe en varm drik. Der er ingen butikker i Den Kolde Ørken™, så du smider
                                20 mønter på jorden i frustration""");
                languageMap.put("Walled City",
                        """
                                Du planlægger en revolution i Walled City, og får alle de normale borgere
                                til at donere alt hvad de ejer. Det er faktisk bare
                                et scam, så du løber med pengene.""");
                languageMap.put("Monastery",
                        "Du tager til templet og beder til guderne i stedet for at være produktiv.");
                languageMap.put("Black Cave",
                        """
                                Du tager ind i en mørk grotte. Den er mørk, så du betaler guderne
                                70 mønter for at finde ud igen""");
                languageMap.put("Huts in the Mountain",
                        """
                                Du finder nogle små hytter i bjergene, og beslutter dig for at røve dem.
                                De var ikke særligt rige""");
                languageMap.put("The Werewall",
                        """
                                Du finder et lille hegn. Pludselig bliver det fuldmåne, og hegnet vokser
                                sig til en mur. Du er så overrasket at du taber 80 mønter""");
                languageMap.put("The Pit",
                        """
                                Du snubler i et lille hul en møgunge fra landsbyen gravede tidligere. Du
                                smækker ham, og han stjæler 50 mønter fra dig.""");
                languageMap.put("The Goldmine",
                        """
                                Du beslutter at du ikke gider spille det her spil længere, så du tager hjem.
                                Dog finder du en ny spiller på vejen, og stjæler over
                                halvdelen af hans penge. Nu vil du gerne spille lidt mere.""");
                // Spiller interaktion
                languageMap.put("Rules",
                        """
                                Begge spillere starter med en pengebeholdning på 1000,-.
                                Slå med terningerne for at lande på et givent felt, med en given værdi,
                                som både kan være positiv eller negativ.
                                Spilleren der først når en pengebeholdning på 3000,- vinder.
                                """);
                languageMap.put("inputPlayerName", "Spiller %d skriv dit navn: ");
                languageMap.put("rollDice", "Tryk 'enter' for at rulle med terningerne: Det er %s's tur");
                languageMap.put("errorNoField", "Der findes kun felter 2-12. Du formåede at slå %d");
                languageMap.put("fieldLandedOn", "\n%s\n\nDu er landet på feltet \"%s\"\nDu har fået %d point");
                languageMap.put("newScore", "%s's nye score er: %d\n");
                languageMap.put("gameResult", "%s har vundet med en score på %d point.\n%s har tabt med en score på %d point");
                languageMap.put("SpecialF10", "Da du er landet på %s får du en ekstra tur!");
            }
            case English -> {
                // Fields
                languageMap.put("Tower",
                        """
                                You pay 50 coins to get into Rundetårn.
                                It's boring, so you hit a guy and he gives you 300 coins to stop hitting him.""");
                languageMap.put("Crater",
                        """
                                You find a very beautiful crater, and decide to take a picture.
                                Unfortunately, the camera isn't invented yet, so you sit down to cry.
                                A little boy comes over to you, kicks you, and takes 100 coins from you.""");
                languageMap.put("Palace Gates",
                        """
                                You talk a soldier by the palace gates into buying a miracle potion from you.
                                It doesn't work, and now he doesn't have enough money to feed his children.""");
                languageMap.put("Cold Dessert",
                        """
                                You arrive at the Cold Desert. It's cold, and you decide to buy a warm drink.
                                There's no stores in the cold desert, so you throw 20 coins on the ground in frustration.""");
                languageMap.put("Walled City",
                        """
                                You plan a revolution in the Walled City, and gather all the citizens.
                                They give you everything they own, but it's all a scam so you run away with the money.""");
                languageMap.put("Monastery",
                        "You travel to the temple and pray to the gods instead of being productive.");
                languageMap.put("Black Cave",
                        """
                                You venture into a dark cave. It's dark,
                                so you pay the gods 70 coins to lead you out again.""");
                languageMap.put("Huts in the Mountain",
                        """
                                You find some small huts in the mountains and decide to rob them.
                                They're not very rich.""");
                languageMap.put("The Werewall",
                        """
                                You find a small fence. Suddenly, it's a full moon out and the fence
                                turns into a great wall. You're so shocked that you drop 80 coins.""");
                languageMap.put("The Pit",
                        """
                                You stumble into a small hole dug by a brat from the city.
                                You smack him in the back of the head, but he takes 50 coins from you in the process.""");
                languageMap.put("The Goldmine",
                        """
                                You decide that you don't want to play this game anymore, and venture home.
                                However, you find a new player on the way and takes more than half of his possessions.
                                Now you wanna play a little longer.""");
                // Spiller interaktion
                languageMap.put("Rules",
                        """
                                Both players start with a balance of 1000,-.
                                Roll the dice to land on a field, with a given value,
                                which can be either positive og negative.
                                The first player to reach a balance of 3000,- wins.
                                """);
                languageMap.put("inputPlayerName", "Player %d enter your name: ");
                languageMap.put("rollDice", "Hit 'enter' to roll the dice: It's %s's turn");
                languageMap.put("errorNoField", "Only field 2-12 exists. You somehow managed to roll %d");
                languageMap.put("fieldLandedOn", "\n%s\n\nYou've landed on the field \"%s\"\nYou got %d points");
                languageMap.put("newScore", "%s's new score is: %d\n");
                languageMap.put("gameResult", "%s won with a score of %d points.\n%s lost with a score of %d points");
                languageMap.put("SpecialF10", "Since you landed on %s you get an extra turn!");
            }
        }
        return languageMap;
    }
}
