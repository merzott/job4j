package ru.merkin.strategy;

/**
 * Class Triangle is implements triangle shape.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    /**
     * height of triangle in rows
     */
    private int size;

    /**
     * Constructor for Triangle class
     *
     * @param size height of triangle
     */
    public Triangle(int size) {
        this.size = size;
    }

    /**
     * Method "draw" is forming triangle from "#" characters
     *
     * @return String object to draw triangle
     */
    public String draw() {
        StringBuilder sb = new StringBuilder();
        if (size > 0) {
            for (int row = 0; row < size - 1; row++) {
                for (int column = 0; column < size * 2 - 1; column++) {
                    sb.append(column == size - 1 + row || column == size - 1 - row ? "#" : " ");
                }
                sb.append(System.lineSeparator());
            }
            for (int column = 0; column < size * 2 - 1; column++) {
                sb.append("#");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
