package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test for "FindLoop" class.
 * @author Roman Merkin
 */
public class FindLoopTest {
    /**
     * Test for "indexOf" method.
     * if array {1, 2, 3} and find element value = 1 than return index 0
     */
    @Test
    public void  indexOfIfArrayOneTwoThreeFindOneThanZero() {
        FindLoop findLoop = new FindLoop();
        int[] dataArr = new int[] {1, 2, 3};
        assertThat(findLoop.indexOf(dataArr, 1), is(0));
    }

    /**
     * Test for "indexOf" method.
     * if array {1, 2, 3} and find element value = 10 than return index -1
     */
    @Test
    public void  indexOfIfArrayOneTwoThreeFindTenThanMinusOne() {
        FindLoop findLoop = new FindLoop();
        int[] dataArr = new int[] {1, 2, 3};
        assertThat(findLoop.indexOf(dataArr, 10), is(-1));
    }
}
