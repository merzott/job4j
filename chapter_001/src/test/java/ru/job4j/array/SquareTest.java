package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test for class "Square"
 * @author Roman Merkin
 */
public class SquareTest {
    /**
     * Test "calculate" method.
     * if calculate(3) than result int[] {1, 4, 9}
     */
    @Test
    public void calculateThreeThanOneFourNine() {
        Square square = new Square();
        int[] result = square.calculate(3);
        int[] expect = new int[] {1, 4, 9};
        assertThat(result, is(expect));
    }

    /**
     * Test "calculate" method.
     * if calculate(1) than result int[] {1}
     */
    @Test
    public void calculateOneThanOne() {
        Square square = new Square();
        int[] result = square.calculate(1);
        int[] expect = new int[] {1};
        assertThat(result, is(expect));
    }

    /**
     * Test "calculate" method.
     * if calculate(5) than result int[] {1, 4, 9, 16, 25}
     */
    @Test
    public void calculateThreeThanOneFourNineSixteenTwentyFive() {
        Square square = new Square();
        int[] result = square.calculate(5);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat(result, is(expect));
    }
}
