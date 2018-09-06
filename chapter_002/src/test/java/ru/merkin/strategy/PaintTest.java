package ru.merkin.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for "Paint" Class.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    /**
     * Test for "draw" method
     *
     * Checks that paint.draw(Square(4)) draws correct.
     */
    @Test
    public void drawSquareSizeFourThanOk() {
        StringBuilder expect = new StringBuilder()
                .append("####").append(System.lineSeparator())
                .append("#  #").append(System.lineSeparator())
                .append("#  #").append(System.lineSeparator())
                .append("####").append(System.lineSeparator())
                .append(System.lineSeparator()
                );
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square(4));
        assertThat(new String(out.toByteArray()), is(expect.toString()));
        System.setOut(stdout);
    }
}
