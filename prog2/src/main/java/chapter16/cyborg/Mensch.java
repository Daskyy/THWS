package chapter16.cyborg;
import java.util.Random;


public class Mensch extends Entscheiden {
    public Entscheidung entscheide(Gefahr gefahr) {
        Random random = new Random();

        if(random.nextInt(4) == 0) {
            return Entscheidung.UNENTSCHIEDEN;
        }

        return switch (gefahr) {
            case GEFAHR_LINKS -> Entscheidung.RECHTS;
            case GEFAHR_RECHTS -> Entscheidung.LINKS;
            case GEFAHR_VORNE -> Entscheidung.BREMSEN;
        };
    }
}
