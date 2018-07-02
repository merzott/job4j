package ru.job4j.conditon;


/**
 * Class Triangle implements triangle from 3 points.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    /**
     * Constructor for Triangle object.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method "exist" checks triangle existion
     *
     * @param ab length of the side AB of the triangle ABC
     * @param bc length of the side BC of the triangle ABC
     * @param ca length of the side CA of the triangle ABC
     * @return true if exist((AB + BC > CA) and (BC + CA > AB) and (CA + AB > BC)) otherwise false
     */
    public boolean exist(double ab, double bc, double ca) {
        return ((ab + bc > ca) && (bc + ca > ab) && (ca + ab > bc));
    }

    public double area() {
        double ab = this.a.distanceToPoint(b);
        double bc = this.b.distanceToPoint(c);
        double ca = this.c.distanceToPoint(a);
        double semiPerimeter = (ab + bc + ca) / 2;

        return this.exist(ab, bc, ca)
                ? Math.sqrt(semiPerimeter * (semiPerimeter - ab) * (semiPerimeter - bc) * (semiPerimeter - ca))
                : -1;
    }
}

