package chapter15.unternehmen;

public class Abteilung {
    String name;
    Abteilungsleiter abteilungsleiter;
    Angestellter[] angestellte;

    public Abteilung(String name, Abteilungsleiter abteilungsleiter, Angestellter[] angestellte) {
        this.name = name;
        this.abteilungsleiter = abteilungsleiter;
        this.angestellte = angestellte;
    }
}
