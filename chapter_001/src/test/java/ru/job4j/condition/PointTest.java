package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.conditon.Point;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test for "Condition" class
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 * */
public class PointTest {
    /**
     * Test distanceToPoint method.
     * if point a(1,1) and b(4,5) then distance between them 5.0
     */
    @Test
    public void maleHeight180ThenWeight92() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        assertThat(a.distanceToPoint(b), closeTo(5.0, 0.1));
    }

}
