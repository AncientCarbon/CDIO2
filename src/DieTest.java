import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class DieTest {

    @Test
    public void equalNumberOfEachFace() {
        int[] diceValues = new int[6];
        Die die = new Die(1, 6);
        for (int i = 0; i < 60000; i++) {
            int faceValue = die.roll() - 1;
            diceValues[faceValue]++;
        }
        for (int i = 0; i < 6; i++) {
            boolean rollRange = diceValues[i] < 9600 || diceValues[i] > 10400;
            assertFalse(rollRange);
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
            int face = die.roll() - 1;
            range[face]++;
        }
        for (int i = 0; i < 10; i++) {
            boolean rollRange = range[i] < 9500 || range[i] > 10500;
            assertFalse(rollRange);
        }
    }
}