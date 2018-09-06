package ru.merkin.strategy;

import org.junit.After;
import org.junit.Before;
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
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

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
        new Paint().draw(new Square(4));
        assertThat(new String(out.toByteArray()), is(expect.toString()));
    }

    /**
     * Test for "draw" method
     *
     * Checks that paint.draw(Triangle(4)) draws correct.
     */
    @Test
    public void drawTriangleSizeFourThanOk() {
        StringBuilder expect = new StringBuilder()
                .append("   #   ").append(System.lineSeparator())
                .append("  # #  ").append(System.lineSeparator())
                .append(" #   # ").append(System.lineSeparator())
                .append("#######").append(System.lineSeparator())
                .append(System.lineSeparator()
                );
        new Paint().draw(new Triangle(4));
        assertThat(new String(out.toByteArray()), is(expect.toString()));
    }
}
