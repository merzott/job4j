package ru.job4j.max;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Test for "Max" class.
 * @author Roman Merkin
 */
public class MaxTest {

    /**
     * Test "max" method.
     * first < second. Both positive.
     * 1 < 2 = 2
     */
    @Test
    public void maxOneAndTwoThenTwo() {
        Max max = new Max();
        assertThat(max.max(1, 2), is(2));
    }

    /**
     * Test "max" method.
     * first > second. Both positive.
     * 4 > 2 = 2
     */
    @Test
    public void maxFourAndTwoThenFour() {
        Max max = new Max();
        assertThat(max.max(4, 2), is(4));
    }

    /**
     * Test "max" method.
     * first < second. Both negative.
     * -4 < -2 = -2
     */
    @Test
    public void maxMinusFourAndMinusTwoThenMinusTwo() {
        Max max = new Max();
        assertThat(max.max(-4, -2), is(-2));
    }

    /**
     * Test "max" method.
     * first > second. Both negative.
     * -2 > -4 = -2
     */
    @Test
    public void maxMinusTwoAndMinusFourThenMinusTwo() {
        Max max = new Max();
        assertThat(max.max(-2, -4), is(-2));
    }

    /**
     * Test "max" method.
     * first > second. First negative. Second zero.
     * -2 < 0 = 0
     */
    @Test
    public void maxMinusTwoAndZeroThenZero() {
        Max max = new Max();
        assertThat(max.max(-2, 0), is(0));
    }

    /**
     * Test "max" method.
     * first > second. First Positive. Second zero.
     * 2 > 0 = 0
     */
    @Test
    public void maxTwoAndZeroThenTwo() {
        Max max = new Max();
        assertThat(max.max(2, 0), is(2));
    }

    /**
     * Test "max" method.
     * first > second. First Positive. Second zero.
     * 2_000_000_000 > 0 = 0
     */
    @Test
    public void maxTwoBlnAndZeroThenTwoBln() {
        Max max = new Max();
        assertThat(max.max(2_000_000_000, 0), is(2_000_000_000));
    }

    /**
     * Test "max" method.
     * first = second. Both positive.
     * 2 > 2 = 2
     */
    @Test
    public void maxTwoAndTwoThenTwo() {
        Max max = new Max();
        assertThat(max.max(2, 2), is(2));
    }

    /**
     * Test "max" method.
     * first = second. Both negative.
     * -2 > -2 = -2
     */
    @Test
    public void maxMinusTwoAndMinusTwoThenMinusTwo() {
        Max max = new Max();
        assertThat(max.max(-2, -2), is(-2));
    }
}
