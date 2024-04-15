package chapter15.unternehmen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeiterTest {
    @Test
    public void testAbteilungsleiter() {
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Max", "Mustermann", "ABCD", 1000, "01.01.1990");
        assertEquals("Max", abteilungsleiter.vorname);
        assertEquals("Mustermann", abteilungsleiter.nachname);
        assertEquals("ABCD", abteilungsleiter.identifikator);
        assertEquals(1000, abteilungsleiter.grundgehalt);
        assertEquals(2, abteilungsleiter.gehaltsfaktor);
        assertEquals("01.01.1990", abteilungsleiter.geburtsdatum);
        assertEquals(2000, abteilungsleiter.gehalt);
    }

    @Test
    public void testBefoerdern() {
        Angestellter angestellter = new Angestellter("Max", "Mustermann", "ABC", 1000, "01.01.1995");
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Jeff", "Bezos", "ABCD", 2000, "01.01.1990");

        abteilungsleiter.befoerdern(angestellter);
        assertEquals(1100, angestellter.gehalt);
    }
}
