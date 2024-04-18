package chapter16.muenzautomat;

public class OptimizedChangeCalculator implements ChangeCalculator
{
    public int[] getChange(int euros, int cent)
    {
        int totalCents = euros * 100 + cent;
        int[] coins = new int[8];
        int[] coinValues = {1, 2, 5, 10, 20, 50, 100, 200};

        for (int i = coinValues.length - 1; i >= 0; i--) {
            coins[i] = totalCents / coinValues[i];
            totalCents %= coinValues[i];
        }

        return coins;
    }
}