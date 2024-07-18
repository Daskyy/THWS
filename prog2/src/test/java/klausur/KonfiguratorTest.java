package klausur;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class KonfiguratorTest {
    @Test
    public void testKonfigurationEinlesen() throws IOException {
        List<String> zeilen = Konfigurator.liesKongurationsdatei();
        Map<String, String> konfiguration = Konfigurator.konfigurationEinlesen();
        String firstentry = zeilen.get(0);
        String lastentry = zeilen.get(zeilen.size() - 1);
        assertEquals(firstentry.split("=")[1], konfiguration.get(firstentry.split("=")[0]));
        assertEquals(lastentry.split("=")[1], konfiguration.get(lastentry.split("=")[0]));
    }
}
