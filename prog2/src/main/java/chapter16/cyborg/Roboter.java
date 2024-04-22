package chapter16.cyborg;

public class Roboter extends Entscheiden {
    public Entscheidung entscheide(Gefahr gefahr) {
//        if (gefahr == null) {
//            throw new IllegalArgumentException("Gefahr darf nicht null sein");
//        }
        return switch (gefahr) {
            case GEFAHR_LINKS -> Entscheidung.RECHTS;
            case GEFAHR_RECHTS -> Entscheidung.LINKS;
            case GEFAHR_VORNE -> Entscheidung.BREMSEN;
        };
    }
}
