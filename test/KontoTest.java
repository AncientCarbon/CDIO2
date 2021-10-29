import org.junit.Test;

import static org.junit.Assert.*;

public class KontoTest {

    @Test
    public void playerBalanceNeverBelowZero(){
        Player player = new Player("");
        player.setBalance(0);
        player.addScore(-100);
        boolean kontoTjek = player.getBalance() < 0;
        assertFalse(kontoTjek);
    }

    @Test
    public void balanceAddsSetAmount(){
        Player player = new Player("");
        player.addScore(100);
        assertEquals(1100, player.getBalance());
    }

    @Test
    public void balanceRemovesSetAmount(){
        Player player = new Player("");
        player.addScore(-500);
        assertEquals(500, player.getBalance());
    }
}