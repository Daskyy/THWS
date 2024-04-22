package chapter16.muenzautomat;

public class OptimizedChangeCalculator implements ChangeCalculator
{
    public int[] getChange(int euros, int cent)
    {
        int totalCents = euros * 100 + cent;
        int[] coins = new int[8];
        Coin[] coinValues = Coin.values();

        for (int i = coinValues.length - 1; i >= 0; i--) {
            coins[i] = totalCents / coinValues[i].value;
            totalCents %= coinValues[i].value;
        }

        return coins;
    }
}