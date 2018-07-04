package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test for "Factorial" class.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {

    /**
     * Test for "calc" method.
     * factorial 5 = 120
     */
    @Test
    public void calcFiveThanOneHundredTwenty() {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(0), is(120));
    }

    /**
     * Test for "calc" method.
     * factorial 0 = 1
     */
    @Test
    public void calcZeroThanOne() {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(0), is(1));
    }

}
