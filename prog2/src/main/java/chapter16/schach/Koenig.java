package chapter16.schach;

public class Koenig extends AbstractFigur {
    public Koenig(int x, int y) {
        super(x, y);
    }

    public Brett gibErlaubteFelder() {
        Brett brett = new Brett();
        int x = this.getX();
        int y = this.getY();

        // oben
        if (y >= 2) brett.markiereFeld(x, y - 1);
        // unten
        if (y <= 7) brett.markiereFeld(x, y + 1);
        // links
        if (x >= 2) brett.markiereFeld(x - 1, y);
        // rechts
        if (x <= 7) brett.markiereFeld(x + 1, y);
        // oben links
        if (x >= 2 && y >= 2) brett.markiereFeld(x - 1, y - 1);
        // oben rechts
        if (x <= 7 && y >= 2) brett.markiereFeld(x + 1, y - 1);
        // unten links
        if (x >= 2 && y <= 7) brett.markiereFeld(x - 1, y + 1);
        // unten rechts
        if (x <= 7 && y <= 7) brett.markiereFeld(x + 1, y + 1);

        return brett;
    }

    public static void main(String[] args) {
        Koenig k = new Koenig(4, 5);
        Brett brett = k.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++) {
        for (int i = 1; i <= 8; i++) {
            if (brett.gibFeld(i, j)) System.out.print("x");
            else System.out.print("o");
        }
        System.out.println();
        }
    }


}
