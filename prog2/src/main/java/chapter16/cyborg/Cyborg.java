package chapter16.cyborg;
import java.util.Random;

public class Cyborg extends Entscheiden{
    private final Mensch mensch = new Mensch();
    private final Entscheidung menschEntscheidung;
    private final Roboter roboter = new Roboter();
    private final Entscheidung roboterEntscheidung;
    private final Random random = new Random();

    public Cyborg(Gefahr gefahr) {
        menschEntscheidung = mensch.entscheide(gefahr);
        roboterEntscheidung = roboter.entscheide(gefahr);
    }

    public Entscheidung entscheide(Gefahr gefahr) {

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
}
