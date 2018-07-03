package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test "Counter" class.
 * @author Roman Merkin
 */
public class CounterTest {

    /**
     * Test "add" Method.
     * start 1, finish 10 - than 30
     */
    @Test
    public void counterOneToTenThanThirty() {
        Counter counter = new Counter();
        assertThat(counter.add(1, 10), is(30));
    }

    /**
     * Test "add" Method.
     * start 10, finish 1 - than 30
     */
    @Test
    public void counterTenToOneThanThirty() {
        Counter counter = new Counter();
        assertThat(counter.add(10, 1), is(30));
    }

    /**
     * Test "add" Method.
     * start 10, finish 10 - than 10
     */
    @Test
    public void counterTenToTenThanTen() {
        Counter counter = new Counter();
        assertThat(counter.add(10, 10), is(10));
    }

    /**
     * Test "add" Method.
     * start -10, finish 10 - than 0
     */
    @Test
    public void counterMinusTenToTenThanZero() {
        Counter counter = new Counter();
        assertThat(counter.add(-10, 10), is(0));
    }
}
