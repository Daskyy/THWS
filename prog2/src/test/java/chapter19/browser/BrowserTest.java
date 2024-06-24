package chapter19.browser;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BrowserTest {
    @Test
    public void testBack() {
        Browser browser = new Browser();
        Optional<URL> back = browser.back();

        // Überprüfen, ob die Methode ein Optional zurückgibt
        assertNotNull(back);

        // Überprüfen, ob das Optional entweder leer ist oder eine URL enthält
        if (back.isPresent()) {
            try {
                assertEquals(new URL("http://google.de"), back.get());
            } catch (MalformedURLException e) {
                fail("Unexpected MalformedURLException");
            }
        } else {
            assertEquals(Optional.empty(), back);
        }
    }
}
