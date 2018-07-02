package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.conditon.Point;
import ru.job4j.conditon.Triangle;

import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
 * Test for "Triangle" class.
 * @author Roman Merkin
 */
public class TriangleTest {
    /**
     * Test for "area" method.
     * point A(0, 0) point B(0, 2) point C(2, 0)
     * area = 2
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area(), closeTo(2D, 0.000001));
    }

    /**
     * Test for "exist" method.
     * point A(1, 0) point B(0, 1) point C(1, 1)
     * triangle AB-BC-CA exists
     */
    @Test
    public void triangleExistAOneZeroBZeroOneCOneOne() {
        Point a = new Point(1, 0);
        Point b = new Point(0, 1);
        Point c = new Point(1, 1);
        Triangle triangle = new Triangle(a, b, c);
        Assert.assertTrue(triangle.exist(a.distanceToPoint(b), b.distanceToPoint(c), c.distanceToPoint(a)));
    }

    /**
     * Test for "exist" method.
     * point A(1, 0) point B(0, 1) point C(1, 1)
     * point D(1000, 1000)
     * triangle AD-BC-CA is not exists
     */
    @Test
    public void triangleExistAOneBOneCOneThenFalse() {
        Point a = new Point(1, 0);
        Point b = new Point(0, 1);
        Point c = new Point(1, 1);
        Point d = new Point(1000, 1000);
        Triangle triangle = new Triangle(a, b, c);
        Assert.assertFalse(triangle.exist(a.distanceToPoint(d), b.distanceToPoint(c), c.distanceToPoint(a)));
    }


}
