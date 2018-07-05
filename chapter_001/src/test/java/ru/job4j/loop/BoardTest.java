package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test for "Board" class.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {

    /**
     * Test for "paint" method.
     * if x_size = 3, y_size = 3 than board will be 3X3
     */
    @Test
    public void paintBoardWidthThreeAndHeightThreeThanStringWithThreeColumnsAndThreeRows() {
        Board board = new Board();
        String ln = System.getProperty(System.lineSeparator());
        String boardStr = board.paint(3, 3);
        assertThat(boardStr, is(String.format("X X%s X %sX X%s", ln, ln, ln)));
    }

    /**
     * Test for "paint" method.
     * if x_size = 5, y_size = 4 than board will be 5X4
     */
    @Test
    public void paintBoardWidthFiveAndHeightFourThanStringWithFiveColumnsAndFourRows() {
        Board board = new Board();
        String ln = System.getProperty(System.lineSeparator());
        String boardStr = board.paint(5, 4);
        assertThat(boardStr, is(String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln)));
    }

}
