package chapter16.muenzautomat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptimizedChangeCalculatorTest {
    @Test
    public void testGetChange2() {
        OptimizedChangeCalculator calculator = new OptimizedChangeCalculator();
        int[] coins = calculator.getChange(2, 50);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 1, 0, 1}, coins);
    }

    @Test
    public void testGetChange() {
        OptimizedChangeCalculator calculator = new OptimizedChangeCalculator();

        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 1}, calculator.getChange(2, 0));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 1, 0}, calculator.getChange(1, 0));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 1, 0, 0}, calculator.getChange(0, 50));
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 0, 0, 0}, calculator.getChange(0, 20));
        assertArrayEquals(new int[]{0, 0, 0, 1, 0, 0, 0, 0}, calculator.getChange(0, 10));
        assertArrayEquals(new int[]{0, 0, 1, 0, 0, 0, 0, 0}, calculator.getChange(0, 5));
        assertArrayEquals(new int[]{0, 1, 0, 0, 0, 0, 0, 0}, calculator.getChange(0, 2));
        assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0}, calculator.getChange(0, 1));

        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 1, 0, 1}, calculator.getChange(2, 50));
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 1, 0, 2}, calculator.getChange(4, 70));
    }

}

