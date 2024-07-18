package klausur.musikstuecksammlung;

public class MusikStueck {
    String titel, interpret;
    int laenge;

    public MusikStueck(String titel, String interpret, int laenge) {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    @Override
    public String toString() {
        return "Titel: " + titel + "; Interpret: " + interpret + " Laenge: " + laenge;
    }

}
