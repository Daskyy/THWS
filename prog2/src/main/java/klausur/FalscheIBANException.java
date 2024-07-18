package klausur;

public class FalscheIBANException extends Exception {
    public FalscheIBANException() {
        super("FEHLER: Datei enthält ungültige IBAN");
    }
    public FalscheIBANException(String args) {
        super(args);
    }
}
