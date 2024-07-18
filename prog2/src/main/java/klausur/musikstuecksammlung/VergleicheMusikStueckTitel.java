package klausur.musikstuecksammlung;
import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {
    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        return o1.interpret.compareTo(o2.interpret);
    }
}
