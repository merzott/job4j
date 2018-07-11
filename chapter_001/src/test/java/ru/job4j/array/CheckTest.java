package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

/**
 * Test for class "Check"
 * @author Roman Merkin
 */
public class CheckTest {
    /**
     * Test for method "check"
     * if dataArr {false, false, true} than false
     */
    @Test
    public void checkTrueFalseTrueThanFalse() {
        Check check = new Check();
        boolean[] dataArr = new boolean[] {false, false, true};
        assertThat(check.mono(dataArr), is(false));
    }

    /**
     * Test for method "check"
     * if dataArr {true, true, true} than true
     */
    @Test
    public void checkTrueTrueTrueThanTrue() {
        Check check = new Check();
        boolean[] dataArr = new boolean[] {true, true, true};
        assertThat(check.mono(dataArr), is(true));
    }

    /**
     * Test for method "check"
     * if dataArr {false, false, false} than true
     */
    @Test
    public void checkFalseFalseFalseThanTrue() {
        Check check = new Check();
        boolean[] dataArr = new boolean[] {false, false, false};
        assertThat(check.mono(dataArr), is(true));
    }
}
