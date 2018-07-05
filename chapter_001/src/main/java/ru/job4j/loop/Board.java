package ru.job4j.loop;

/**
 * Class "Board" needs draw checkmate board, using StringBuilder.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Board {

    /**
     * Method "paint" draws checkmate board, having size x_size X y_size.
     *
     * @param xSize int number of cells in line
     * @param ySize int number of lines
     * @return String
     */
    public String paint(int xSize, int ySize) {
        StringBuilder str = new StringBuilder();
        String ln = System.getProperty(System.lineSeparator());
        for (int j = 0; j < ySize; j++) {
            for (int i = 0; i < xSize; i++) {
                if (j % 2 == 0) {
                    str.append((i % 2 == 0) ? 'X' : ' ');
                } else {
                    str.append((i % 2 == 0) ? ' ' : 'X');
                }
            }
            str.append(ln);
        }
        return str.toString();
    }
}