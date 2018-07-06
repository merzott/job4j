package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import java.util.StringJoiner;

/** Test "Paint" for class .
 * @author Roman Merkin
 */
public class PaintTest {
    /**
     * Test for pyramid method.
     * for height = 4
     */
    @Test
    public void pyramidHeightFourThanFourRows() {
        Paint paint = new Paint();
        String pyramid;
        pyramid = paint.pyramid(4);
        System.out.println(pyramid);
        assertThat(pyramid, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("   ^   ")
                .add("  ^^^  ")
                .add(" ^^^^^ ")
                .add("^^^^^^^")
                .toString()
        ));
    }
    /**
     * Test for pyramid method.
     * for height = 1
     */
    @Test
    public void pyramidHeightOneThanOneRows() {
        Paint paint = new Paint();
        String pyramid;
        pyramid = paint.pyramid(1);
        System.out.println(pyramid);
        assertThat(pyramid, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("^")
                        .toString()
        ));
    }
}
