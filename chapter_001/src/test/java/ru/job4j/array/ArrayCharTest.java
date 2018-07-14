package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for "ArrayChar" class.
 * @author Roman Merkin
 */
public class ArrayCharTest {

    /**
     * Test for "startWithPrefix" method.
     * if line = "Hello" and prefix = "He" than true (prefix length < line length)
     */
    @Test
    public void startWithPrefixMethodLineHelloPrefixHeThanTrue() {
        ArrayChar arrayChar = new ArrayChar("Hello");
        assertThat(arrayChar.startWithPrefix("He"), is(true));
    }

    /**
     * Test for "startWithPrefix" method.
     * if line = "Hello" and prefix = "Hellolala" than false (prefix length > line length)
     */
    @Test
    public void startWithPrefixMethodLineHelloPrefixHellolalaThanFalse() {
        ArrayChar arrayChar = new ArrayChar("Hello");
        assertThat(arrayChar.startWithPrefix("Hellolala"), is(false));
    }

    /**
     * Test for "startWithPrefix" method.
     * if line = "Hello" and prefix = "Hello" than true (prefix length = line length)
     */
    @Test
    public void startWithPrefixMethodLineHelloPrefixHelloThanFalse() {
        ArrayChar arrayChar = new ArrayChar("Hello");
        assertThat(arrayChar.startWithPrefix("Hello"), is(true));
    }

    /**
     * Test for "startWithPrefix" method.
     * if line = "Hello" and prefix = "Hela" than false
     */
    @Test
    public void startWithPrefixMethodLineHelloPrefixHelaThanFalse() {
        ArrayChar arrayChar = new ArrayChar("Hello");
        assertThat(arrayChar.startWithPrefix("Hela"), is(false));
    }
}
