/**
 * Field klassen skaber objekter med seperate informationer omkring et felt.
 */

public class Field {
    private int point;
    private String name;
    private String description;

    public Field(String name, int point, String description) {
        this.name = name;
        this.point = point;
        this.description = description;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}