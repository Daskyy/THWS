package chapter16.cyborg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CyborgTest {
    @Test
    public void testEntscheide() {
        Entscheiden entscheiden = new Entscheiden() {
            @Override
            public Entscheidung entscheide(Gefahr gefahr) {
                return Entscheidung.UNENTSCHIEDEN;
            }
        };
        assertEquals(Entscheidung.UNENTSCHIEDEN, entscheiden.entscheide(Gefahr.GEFAHR_LINKS));
        assertEquals(Entscheidung.UNENTSCHIEDEN, entscheiden.entscheide(Gefahr.GEFAHR_RECHTS));
        assertEquals(Entscheidung.UNENTSCHIEDEN, entscheiden.entscheide(Gefahr.GEFAHR_VORNE));
    }

    @Test
    public void testRoboter() {
        Roboter roboter = new Roboter();
        assertEquals(Entscheidung.LINKS, roboter.entscheide(Gefahr.GEFAHR_RECHTS));
        assertEquals(Entscheidung.RECHTS, roboter.entscheide(Gefahr.GEFAHR_LINKS));
        assertEquals(Entscheidung.BREMSEN, roboter.entscheide(Gefahr.GEFAHR_VORNE));
    }

    // Teste Mensch 20 Mal und überprüfe ob UNENTSCHIEDEN mindestens 2 Mal zurückgegeben wird
    // Chance für Nichteintreten ist 3/4^20 = 0.
    @Test
    public void testMensch() {
        Mensch mensch = new Mensch();
        int unentschiedenCount = 0;
        for (int i = 0; i < 20; i++) {
            if (mensch.entscheide(Gefahr.GEFAHR_LINKS) == Entscheidung.UNENTSCHIEDEN) {
                unentschiedenCount++;
            }
        }
        assertTrue(unentschiedenCount >= 2);
    }

    @Test
    public void testCyborg() {
        Cyborg cyborg = new Cyborg(Gefahr.GEFAHR_LINKS);
        Entscheidung entscheidung = cyborg.entscheide(Gefahr.GEFAHR_LINKS);
        assertTrue(entscheidung == Cyborg.roboterEntscheidung || entscheidung == Cyborg.menschEntscheidung);
    }

    @Test
    public void testNullGefahr() {
        assertThrows(NullPointerException.class, () -> new Cyborg(null));
        assertThrows(NullPointerException.class, () -> new Mensch().entscheide(null));
        assertThrows(NullPointerException.class, () -> new Roboter().entscheide(null));
    }

    @Test
    public void testMain() {
        Cyborg.main(null);
    }
}
