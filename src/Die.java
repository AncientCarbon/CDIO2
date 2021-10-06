/**
 * javas Math klasse bruges til at vælge et tilfældigt tal mellem 1 og _sides
 */

public class Die {
    int MINfaceValue; //starter med værdien 0
    int MAXfaceValue;
    int faceValue;

    public Die(int _MINfaceValue, int _MAXfaceValue){
        this.MINfaceValue = _MINfaceValue;
        this.MAXfaceValue = _MAXfaceValue;
    }

    public int roll(){ //funktionen roll ruller en terning med x-antal sider.
        // Metode der kan køre når man har lavet et Dice objekt
        faceValue = (int) (Math.floor(Math.random()*(this.MAXfaceValue - this.MINfaceValue + 1) + this.MINfaceValue));
        return faceValue; //Maksimum værdi på terningen = 6. Minimum værdi på terningen = 1
        // Maksimum værdi på terningen = 6.
        // Minimum værdi på terningen = 1
    }
}
