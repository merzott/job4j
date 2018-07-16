package ru.job4j.array;

/**
 * Class "MatrixCheck" is needed to check that all diagonal elements in two-dimensional boolean array, are equal.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Method "mono" checks that all diagonal elements in two-dimensional boolean array, are equal.
     * @param data input boolean two-dimensional array
     * @return true if all elements in both diagonal are equal for each diagonal separately. otherwise false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int maxNum = data.length - 1;
        for (int index = 0; index < maxNum; index++) {
            if ((data[index][index] != data[index + 1][index + 1]) || (data[index][maxNum - index] != data[index + 1][maxNum - 1 - index])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
