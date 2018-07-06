package ru.job4j.loop;

/**
 * Class "Paint" needed to draw figures using StringBuilder.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Method "pyramid" draws pyramid using "^".
     * @param height number of rows of pyramid
     * @return String variable. Pyramid witch has "height" num of rows
     */
    public String pyramid(int height) {
        StringBuilder pyramidStr = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int column = 1; column < 2 * height; column++) {
                if ((column < height - row) || (column > height + row)) {
                    pyramidStr.append(' ');
                } else {
                    pyramidStr.append('^');
                }
            }
            //pyramidStr.append(System.getProperty("lineSeparator"));// null value???
            //pyramidStr.append(System.getProperty(System.lineSeparator()));// null value???
            pyramidStr.append(System.lineSeparator());
        }
        return pyramidStr.toString();
    }
}