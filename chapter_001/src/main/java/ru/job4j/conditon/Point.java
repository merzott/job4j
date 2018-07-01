package ru.job4j.conditon;

/**
 * class Point.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;

    /**
     * Constructor.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method to calculate distance between this and another point.
     */
    public double distanceToPoint(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**
     * Main method prints coordinates points A and B and distance between them.
     */
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        double distance = a.distanceToPoint(b); // distance between points a and b

        System.out.println("xA = " + a.x);
        System.out.println("yA = " + a.y);
        System.out.println("xB = " + b.y);
        System.out.println("yB = " + b.y);
        System.out.println("Distance between point A and point B = " + distance);

    }
}
