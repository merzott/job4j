package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for class "Matrix".
 *
 * @author Roman Merkin
 */
public class MatrixTest {

    /**
     * Test for "multiply" method.
     * if size = 2 than matrix {{1, 2}, {2, 4}};
     */
    @Test
    public void multiplySize2Than1224() {
        Matrix matrix = new Matrix();
        int size = 2;
        int[][] matrixArr2D = matrix.multiply(size);
        int[][] expect = new int[][]{
                {1, 2},
                {2, 4}
        };
        assertThat(matrixArr2D, is(expect));
    }
}
