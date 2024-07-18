package klausur.fahrzeuge;
import java.util.List;

public class Umsatzberechner {
    public double berechneUmsatz(List<Fahrzeug> fahrzeuge) {
        double gesamtumsatz = 0;
        for (Fahrzeug fahrzeug : fahrzeuge) {
            for (Fahrt fahrt : fahrzeug.fahrten) {
                gesamtumsatz += fahrzeug.berechneEntgelt(fahrt);
            }
        }
        return gesamtumsatz;
    }
}
