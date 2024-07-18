package klausur.musikstuecksammlung;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MusikStueckSammlung {
    Map<String, MusikStueck> sammlung = new HashMap<>();

    public void musikStueckEinfuegen(MusikStueck neu) {
        if(sammlung.containsKey(neu.titel)) {
            throw new IllegalArgumentException("Yarak");
        } else {
            sammlung.put(neu.titel, neu);
        }
    }

    public MusikStueck[] getAlleMusikStueckeNachTitel() {
        MusikStueck[] out = new MusikStueck[sammlung.size()];
        int i = 0;
        for (MusikStueck musikStueck : sammlung.values()) {
            out[i] = musikStueck;
            i++;
        }
        Arrays.sort(out, new VergleicheMusikStueckTitel());
        return out;
    }
}
