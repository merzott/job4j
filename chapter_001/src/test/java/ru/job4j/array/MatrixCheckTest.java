package ru.job4j.array;


import org.junit.Test;
import static  org.hamcrest.core.Is.is;
import static  org.junit.Assert.assertThat;

/**
 * Test for "MatrixCheck" class.
 * @author Roman Merkin
 */
public class MatrixCheckTest {
    /**
     * Test "mono" method
     * size 3x3. all elements equal true except first. expect false.
     */
    @Test
    public void monoSize3False() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] data = new boolean[][] {
                {false, true, true},
                {true, true, true},
                {true, true, true}};
        assertThat(matrixCheck.mono(data), is(false));
    }

    /**
     * Test "mono" method
     * size 3x3. all elements equal true. expect true.
     */
    @Test
    public void monoSize3True() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] data = new boolean[][] {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        assertThat(matrixCheck.mono(data), is(true));
    }

    /**
     * Test "mono" method
     * size 4x4. all elements equal true, except left to right diagonal. expect true.
     */
    @Test
    public void monoSize4True() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] data = new boolean[][] {
                {false, true, true, true},
                {true, false, true, true},
                {true, true, false, true},
                {true, true, true, false}
        };
        assertThat(matrixCheck.mono(data), is(true));
    }
}
