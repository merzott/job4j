package ru.job4j.array;

/**
 * Class "Matrix" is needed to fill the two-dimensional array with values.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Matrix {

    /**
     * Method "multiply" is needed to fill two-dimensional array with values equals multiply
     * rowNum and columnNum (starts from 1)
     *
     * @param size size of matrix (rows = columns = size), size >= 2
     * @return matrix[size][size], where value in cell = rowNum * columnNum
     */
    public int[][] multiply(int size) {
        int[][] resultMatrix = new int[size][size];
        for (int column = 0; column < size; column++) {
            for (int row = 0; row < size; row++) {
                resultMatrix[row][column] = (row + 1) * (column + 1);
            }
        }
        return resultMatrix;
    }
}
