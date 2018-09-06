package ru.merkin.strategy;

/**
 * Class Square is implements square shape.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Square implements Shape {
    /**
     * height of square in rows
     */
    private int size;

    /**
     * Constructor for Square class
     *
     * @param size height of square
     */
    public Square(int size) {
        this.size = size;
    }

    /**
     * Method "draw" is forming triangle from "#" characters
     *
     * @return String object to draw square
     */
    public String draw() {
        StringBuilder sb = new StringBuilder();
        switch (this.size) {
            case 0:
                break;
            case 1:
                sb.append("#").append(System.lineSeparator());
                break;
            default:
                for (int column = 0; column < size; column++) {
                    sb.append("#");
                }
                sb.append(System.lineSeparator());
                for (int row = 1; row < size - 1; row++) {
                    sb.append("#");
                    for (int column = 1; column < size - 1; column++) {
                        sb.append(" ");
                    }
                    sb.append("#").append(System.lineSeparator());

                }
                for (int column = 0; column < size; column++) {
                    sb.append("#");
                }
                sb.append(System.lineSeparator());
                break;
        }
        return sb.toString();
    }
}
