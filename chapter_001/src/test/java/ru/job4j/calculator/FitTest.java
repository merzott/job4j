package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test for "Fit" class
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 * */
public class FitTest {
    /**
     * Test maleWeight method.
     * if height 180 then weight 92
     */
    @Test
    public void maleHeight180ThenWeight92() {
        Fit fit = new Fit();
        double weight = fit.maleWeight(180);
        assertThat(weight, closeTo(92.0,0.1));
    }

    /**
     * Test maleWeight method.
     * if height 180 then weight 92
     */
    @Test
    public void femaleHeight170ThenWeight69() {
        Fit fit = new Fit();
        double weight = fit.femaleWeight(170);
        assertThat(weight, closeTo(69.0,0.1));
    }

}
