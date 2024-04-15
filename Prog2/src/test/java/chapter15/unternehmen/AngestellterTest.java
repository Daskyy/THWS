package chapter15.unternehmen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AngestellterTest {
    @Test
    public void testAngestellter() {
        Angestellter angestellter = new Angestellter("Max", "Mustermann", "ABC", 1000, "01.01.1990");
        assertEquals("Max", angestellter.vorname);
        assertEquals("Mustermann", angestellter.nachname);
        assertEquals("ABC", angestellter.identifikator);
        assertEquals(1000, angestellter.grundgehalt);
        assertEquals(1, angestellter.gehaltsfaktor);
        assertEquals("01.01.1990", angestellter.geburtsdatum);
        assertEquals(1000, angestellter.gehalt);
    }
}
