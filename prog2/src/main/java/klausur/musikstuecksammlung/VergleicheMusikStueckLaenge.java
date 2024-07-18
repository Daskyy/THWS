package klausur.musikstuecksammlung;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        if(o1.laenge > o2.laenge) {
            return 1;
        } else {
            return 2;
        }
    }
}
