import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class DieTest {

    @Test
    public void equalRollsOfEachFace() {
        int[] faceValues = new int[6];
        Die die = new Die(1, 6);
        for (int i = 0; i < 60000; i++) {
            int index = die.roll() - 1; // faceValue 1 == index 0 etc.
            faceValues[index]++; // Lægger 1 til det givne index
        }

        for (int i = 0; i < 6; i++) {
            boolean rollRange = faceValues[i] < 9600 || faceValues[i] > 10400; // TotalFaceValue. Cirka 10000 per faceValue
            assertFalse(rollRange); // Falsk hvis ovenstående påstand er falsk, ellers sand
        }
    }

    @Test
    public void everyRollIsWithinRange() {
        Die die = new Die(1, 6);
        for (int i = 0; i < 60000; i++) {
            int faceValue = die.roll();
            boolean rangeCheck = faceValue < 1 || faceValue > 6;
            assertFalse(rangeCheck);
        }
    }

    @Test
    public void diceCanHaveCustomFaces() {
        Die die = new Die(1, 10);
        int[] range = new int[10];
        for (int i = 0; i < 100000; i++) {
            int index = die.roll() - 1;
            range[index]++;
        }
        for (int i = 0; i < 10; i++) {
            boolean rollRange = range[i] < 9500 || range[i] > 10500;
            assertFalse(rollRange);
        }
    }
}