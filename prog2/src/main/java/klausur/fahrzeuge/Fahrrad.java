package klausur.fahrzeuge;

public class Fahrrad extends Fahrzeug {
    @Override
    double berechneEntgelt(Fahrt fahrt) {
        return fahrt.min * 0.125;
    }
}
