/**
 * Field klassen skaber objekter med seperate informationer omkring et felt.
 */

public class Field {
    public int point;
    public String name;
    public String description;

    public Field(String name, int point, String description) {
        this.name = name;
        this.point = point;
        this.description = description;
    }
}