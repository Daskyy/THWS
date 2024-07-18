package klausur.musikstuecksammlung;

public class Main {
    public static void main(String[] args) {
        MusikStueck m = new MusikStueck("a", "a", 1);
        MusikStueck m2 = new MusikStueck("b", "b", 2);
        MusikStueck m3 = new MusikStueck("c", "c", 3);
        MusikStueck m4 = new MusikStueck("d", "d", 4);
        MusikStueckSammlung musikStueckSammlung = new MusikStueckSammlung();
        musikStueckSammlung.musikStueckEinfuegen(m2);
        musikStueckSammlung.musikStueckEinfuegen(m);
        musikStueckSammlung.musikStueckEinfuegen(m3);
        musikStueckSammlung.musikStueckEinfuegen(m4);





        for (int i = 0; i < musikStueckSammlung.getAlleMusikStueckeNachTitel().length; i++) {
            System.out.println(musikStueckSammlung.getAlleMusikStueckeNachTitel()[i].toString());
        }
    }
}
