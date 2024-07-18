package klausur.fahrzeuge;

public class EMotoroller extends Fahrzeug implements Elektrofahrzeug {

    @Override
    public void kehreZueruckZurLadeStation() {

    }

    @Override
    double berechneEntgelt(Fahrt fahrt) {
        return 0;
    }
}
