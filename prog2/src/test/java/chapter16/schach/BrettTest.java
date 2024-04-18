package chapter16.schach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BrettTest {

    @Test
    public void testMarkiereFeld() {
        Brett brett = new Brett();
        brett.markiereFeld(1, 1);
        brett.markiereFeld(2, 2);
        brett.markiereFeld(3, 3);

        assertTrue(brett.gibFeld(1, 1));
        assertTrue(brett.gibFeld(2, 2));
        assertTrue(brett.gibFeld(3, 3));
        assertFalse(brett.gibFeld(4, 4));
    }

    @Test
    public void testKombiniere() {
        Brett brett1 = new Brett();
        brett1.markiereFeld(1, 1);
        brett1.markiereFeld(2, 2);
        brett1.markiereFeld(3, 3);

        Brett brett2 = new Brett();
        brett2.markiereFeld(3, 3);
        brett2.markiereFeld(4, 4);
        brett2.markiereFeld(5, 5);

        Brett brett = brett1.kombiniere(brett2);

        assertTrue(brett.gibFeld(1, 1));
        assertTrue(brett.gibFeld(2, 2));
        assertTrue(brett.gibFeld(3, 3));
        assertTrue(brett.gibFeld(4, 4));
        assertTrue(brett.gibFeld(5, 5));
        assertFalse(brett.gibFeld(6, 6));
    }

    @Test
    public void testKombiniere2() {
        Brett brett1 = new Brett();
        brett1.markiereFeld(1, 1);
        brett1.markiereFeld(2, 2);
        brett1.markiereFeld(3, 3);

        Brett brett2 = new Brett();
        brett2.markiereFeld(3, 3);
        brett2.markiereFeld(4, 4);
        brett2.markiereFeld(5, 5);

        Brett brett = brett2.kombiniere(brett1);

        assertTrue(brett.gibFeld(1, 1));
        assertTrue(brett.gibFeld(2, 2));
        assertTrue(brett.gibFeld(3, 3));
        assertTrue(brett.gibFeld(4, 4));
        assertTrue(brett.gibFeld(5, 5));
        assertFalse(brett.gibFeld(6, 6));
    }
}
