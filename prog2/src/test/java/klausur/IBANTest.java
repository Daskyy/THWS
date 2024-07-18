package klausur;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IBANTest {
    @Test
    public void ibanCheckTest () throws FalscheIBANException {
        IBAN iban = new IBAN();
        assertTrue(iban.ibanCheck("DE92929292929292929292"));
        assertThrows(FalscheIBANException.class, () -> iban.ibanCheck("penis"));
    }
}

