package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Class "Paint" needed to draw figures using StringBuilder.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Method "rightTrl" need to draws right triangle like String variable.
     * @param height height of triangle
     * @return right triangle with height "height" like a String variable.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> (row >= column)
        );
    }

    /**
     * Method "leftTrl" need to draws left triangle like String variable.
     * @param height height of triangle
     * @return left triangle with height "height" like a String variable.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> (row >= height - column - 1)
        );
    }

    /**
     * Method "pyramid" need to draws pyramid like String variable.
     * @param height height of triangle
     * @return pyramid with height "height" like a String variable.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> ((row >= height - column - 1) && (row >= column - height + 1))
        );
    }

    /**
     * Method "loopBy" need to draws arbitrary pyramid like String variable.
     * @param height height of the pyramid
     * @param width width of the pyramid
     * @param predict predict
     * @return figure like a String variable.
     */
    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}