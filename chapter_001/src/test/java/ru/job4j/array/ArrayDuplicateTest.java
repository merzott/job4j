package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for class "ArrayDuplicate"
 *
 * @author Roman Merkin
 */
public class ArrayDuplicateTest {
    /**
     * Test for "remove" method.
     * input array {"3", "2", "1", "1", "2", "3"} than output  {"3", "2", "1"}
     */
    @Test
    public void remove321123Than321() {
        String[] array = new String[]{"3", "2", "1", "1", "2", "3"};
        String[] expect = new String[]{"3", "2", "1"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        assertThat(arrayDuplicate.remove(array), is(expect));
    }

    /**
     * Test for "remove" method.
     * input array {"3", "2", "1", "1", "2", "3"} than output  {"3", "2", "1"}
     */
    @Test
    public void remove111111Than1() {
        String[] array = new String[]{"1", "1", "1", "1", "1", "1"};
        String[] expect = new String[]{"1"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        assertThat(arrayDuplicate.remove(array), is(expect));
    }
}