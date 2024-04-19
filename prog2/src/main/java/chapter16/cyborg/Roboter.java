package chapter16.cyborg;

public class Roboter extends Entscheiden {
    public Entscheidung entscheide(Gefahr gefahr) {
        return switch (gefahr) {
            case GEFAHR_LINKS -> Entscheidung.RECHTS;
            case GEFAHR_RECHTS -> Entscheidung.LINKS;
            case GEFAHR_VORNE -> Entscheidung.BREMSEN;
        };
    }
}
