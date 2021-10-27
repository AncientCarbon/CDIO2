import org.junit.Test;

import static org.junit.Assert.*;

public class KontoTest {

    @Test
    public void playerBalanceNeverBelowZero(){
        Konto konto = new Konto(0);
        konto.addScore(-100);
        boolean kontoTjek = konto.getBalance() < 0;
        assertTrue(kontoTjek);
    }

    @Test
    public void balanceAddsSetAmount(){
        Konto konto = new Konto(0);
        konto.addScore(1000);
        assertEquals(1000, konto.getBalance());
    }

    @Test
    public void balanceRemovesSetAmount(){
        Konto konto = new Konto(1000);
        konto.addScore(-500);
        assertEquals(500, konto.getBalance());
    }
}