import java.util.HashMap;

public class FieldFactory {
    public static HashMap<Integer, Field> createFieldMap(HashMap<String, String> languageMap) {


        Field F2 = new Field("Tower", 250, languageMap.get("Tower"));
        Field F3 = new Field("Crater", -100, languageMap.get("Crater"));
        Field F4 = new Field("Palace Gates", 100, languageMap.get("Palace Gates"));
        Field F5 = new Field("Cold Dessert", -20, languageMap.get("Cold Dessert"));
        Field F6 = new Field("Walled City", 180, languageMap.get("Walled City"));
        Field F7 = new Field("Monastery", 0, languageMap.get("Monastery"));
        Field F8 = new Field("Black Cave", -70, languageMap.get("Black Cave"));
        Field F9 = new Field("Huts in the Mountain", 60, languageMap.get("Huts in the Mountain"));
        Field F10 = new Field("The Werewall", -80, languageMap.get("The Werewall"));
        Field F11 = new Field("The Pit", -50, languageMap.get("The Pit"));
        Field F12 = new Field("The Goldmine", 650, languageMap.get("The Goldmine"));

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
