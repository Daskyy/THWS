package chapter16.schach;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }

  public Brett kombiniere(Brett brett) {
    for (int i = 1; i <= 8; i++)
    {
      for (int j = 1; j <= 8; j++)
      {
        if (this.gibFeld(i, j) || brett.gibFeld(i, j))
        {
          this.markiereFeld(i, j);
        }
      }
    }
    return this;
  }

  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
}
