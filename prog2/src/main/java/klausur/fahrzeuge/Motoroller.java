package klausur.fahrzeuge;

public class Motoroller extends Fahrzeug {
    @Override
    double berechneEntgelt(Fahrt fahrt) {
        return fahrt.km * 0.15 + 3;
    }
}
