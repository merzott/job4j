package ru.merkin.strategy;

/**
 * Class Paint is drawing shapes.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Method "draw" is drawing shapes from "#" characters
     *
     * @return String object to draw triangle
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
