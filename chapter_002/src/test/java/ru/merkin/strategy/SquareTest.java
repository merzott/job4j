package ru.merkin.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for "Square" Class.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {
    /**
     * Test for "draw" method
     *
     * Checks that Square(4).draw() is forming correct String object.
     */
    @Test
    public void drawSquareSizeFour() {
        StringBuilder expect = new StringBuilder()
                .append("####").append(System.lineSeparator())
                .append("#  #").append(System.lineSeparator())
                .append("#  #").append(System.lineSeparator())
                .append("####").append(System.lineSeparator());
        assertThat(new Square(4).draw(), is(expect.toString()));
    }
}
