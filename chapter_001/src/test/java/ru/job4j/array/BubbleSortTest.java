package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test for class "BubbleSort"
 * @author Roman Mekin
 */
public class BubbleSortTest {
    /**
     * Test for "sort" method.
     * if input array {9, 8, 7, 6, 5, 4, 3, 2, 1, 0} than sorted {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
     */
    @Test
    public void sortArray9876543210Than0123456789() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(bubbleSort.sort(array), is(expect));
    }

    /**
     * Test for "sort" method.
     * if input array {9, 8, 7, -6, -5, -4, 3, 2, 1, 0} than sorted {-6, -5, -4, 0, 1, 2, 3, 7, 8, 9}
     */
    @Test
    public void sortArray987M6M5M43210ThanM6M5M40123789() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[] {9, 8, 7, -6, -5, -4, 3, 2, 1, 0};
        int[] expect = new int[] {-6, -5, -4, 0, 1, 2, 3, 7, 8, 9};
        assertThat(bubbleSort.sort(array), is(expect));
    }

}
