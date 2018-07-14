package ru.job4j.array;

/**
 * Class "BubbleSort" is needed to sort array using bubble sort method.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    /**
     * Method "sort" sorts array using bubble sort method
     * @param array array of integer to sort
     * @return sorted array of integer
     */
    public int[] sort(int[] array) {
        int temp;
        for (int step = 0; step < array.length - 1; step++) {
            for (int index = 0; index < array.length - 1 - step; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = temp;
                }
            }
        }
        return array;
    }
}
