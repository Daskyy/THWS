package chapter16.cyborg;
import java.util.Random;

public class Cyborg extends Entscheiden{
    public static Entscheidung menschEntscheidung = null;
    public static Entscheidung roboterEntscheidung = null;
    private final Random random = new Random();

    public Cyborg(Gefahr gefahr) {
        Mensch mensch = new Mensch();
        menschEntscheidung = mensch.entscheide(gefahr);
        Roboter roboter = new Roboter();
        roboterEntscheidung = roboter.entscheide(gefahr);
    }

    public Entscheidung entscheide(Gefahr gefahr) {
//        if (gefahr == null) {
//            throw new IllegalArgumentException("Gefahr darf nicht null sein");
//        }

        if(menschEntscheidung == roboterEntscheidung) {
            return menschEntscheidung;
        } else {
            if(random.nextBoolean()) { // 50% Chance
                return menschEntscheidung;
            } else {
                return roboterEntscheidung;
            }
        }
    }

    public static void main(String[] args) {
        for (Gefahr gefahr : Gefahr.values()) {
            Cyborg cyborg = new Cyborg(gefahr);
            System.out.println("Gefahr: " + gefahr);
            System.out.println("Cyborg entscheidet: " + cyborg.entscheide(gefahr));
            System.out.println("Mensch entscheidet: " + menschEntscheidung);
            System.out.println("Roboter entscheidet: " + roboterEntscheidung);
            System.out.println();
        }
    }
}
