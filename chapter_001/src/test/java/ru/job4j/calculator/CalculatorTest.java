package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test "Calculator" class.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 *
 **/
public class CalculatorTest {
    /**
     * Test "add" method.
     * 1 + 1 = 2
     *
     * */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test "sub" method.
     * 2 - 1 = 1
     *
     * */
    @Test
    public void whenSubOneFromTwoThenOne() {
        Calculator calc = new Calculator();
        calc.sub(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Test "mul" method.
     * 2 * 2 = 4
     *
     * */
    @Test
    public void whenMulTwoToTwoThenFour() {
        Calculator calc = new Calculator();
        calc.mul(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }

    /**
     * Test "div" method.
     * 4 / 2 = 2
     *
     * */
    @Test
    public void whenDivFourToTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
