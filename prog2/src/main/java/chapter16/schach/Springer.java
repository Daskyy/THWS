package chapter16.schach;

public class Springer extends AbstractFigur
{
  public Springer(int x, int y)
  {
    super(x, y);
  }

    public Brett gibErlaubteFelder()
    {
        Brett brett = new Brett();
        int x = this.getX();
        int y = this.getY();

        // oben links
        if (x >= 3 && y >= 2) brett.markiereFeld(x - 2, y - 1);
        // oben rechts
        if (x <= 7 && y >= 2) brett.markiereFeld(x + 2, y - 1);
        // unten links
        if (x >= 3 && y <= 7) brett.markiereFeld(x - 2, y + 1);
        // unten rechts
        if (x <= 7 && y <= 7) brett.markiereFeld(x + 2, y + 1);
        // links oben
        if (x >= 2 && y >= 3) brett.markiereFeld(x - 1, y - 2);
        // rechts oben
        if (x <= 7 && y >= 3) brett.markiereFeld(x + 1, y - 2);
        // links unten
        if (x >= 2 && y <= 6) brett.markiereFeld(x - 1, y + 2);
        // rechts unten
        if (x <= 7 && y <= 6) brett.markiereFeld(x + 1, y + 2);

        return brett;
    }

    public static void main(String[] args)
    {
        Springer s = new Springer(4,5);
        Brett brett = s.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++)
        {
            for (int i = 1; i <= 8; i++)
            {
                if (brett.gibFeld(i, j)) System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
    }
}
