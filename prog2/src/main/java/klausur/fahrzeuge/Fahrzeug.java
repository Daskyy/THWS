package klausur.fahrzeuge;

import java.util.List;

public abstract class Fahrzeug {
    public List<Fahrt> fahrten;
    abstract double berechneEntgelt(Fahrt fahrt);
    public void eintragen(Fahrt fahrt) {
        fahrten.add(fahrt);
    }

    public List<Fahrt> getFahrten() {
        return fahrten;
    }
}
