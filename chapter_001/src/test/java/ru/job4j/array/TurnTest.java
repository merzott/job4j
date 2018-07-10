package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for "Turn" class.
 * @author Roman Merkin
 */
public class TurnTest {
    /**
     * Test for "back" method.
     * if input array {1, 2, 3} than {3, 2, 1}
     */
    @Test
    public void backIfOneTwoTreeThanThreeTwoOne() {
        Turn turn = new Turn();
        int[] dataArr = new int[] {1, 2, 3};
        int[] expect = new int[] {3, 2, 1};
        assertThat(turn.back(dataArr), is(expect));
    }

    /**
     * Test for "back" method.
     * if input array {1, 2, 3, 4} than {4, 3, 2, 1}
     */
    @Test
    public void backIfOneTwoTreeFourThanFourThreeTwoOne() {
        Turn turn = new Turn();
        int[] dataArr = new int[] {1, 2, 3, 4};
        int[] expect = new int[] {4, 3, 2, 1};
        assertThat(turn.back(dataArr), is(expect));
    }

}
