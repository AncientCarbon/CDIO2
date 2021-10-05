/**
 * javas Math klasse bruges til at vælge et tilfældigt tal mellem 1 og _sides
 */

public class Die {
    int sides; //starter med værdien 0
    int faceValue;

    public Die(int _sides){
        this.sides = _sides; // sides angives som det givne _sides, som bliver givet i Dicegame-klassen
    }

    public int roll(){ //funktionen roll ruller en terning med x-antal sider.
        // Metode der kan køre når man har lavet et Dice objekt
        faceValue = (int) Math.floor(Math.random()*this.sides+1);
        return faceValue; //Maksimum værdi på terningen = 6. Minimum værdi på terningen = 1
        // Maksimum værdi på terningen = 6.
        // Minimum værdi på terningen = 1
    }
}