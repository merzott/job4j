package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test for "TwoSortedArraysUnited" class.
 * @author Roman Merkin.
 *
 */
public class TwoSortedArraysUnitedTest {
    /**
     * Test union method.
     *
     */
    @Test
    public void union123And456Than123456() {
        TwoSortedArraysUnited twoSortedArraysUnited = new TwoSortedArraysUnited();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] union = twoSortedArraysUnited.union(arr1, arr2);

        assertThat(union, is(expect));
    }

    /**
     * Test union method.
     *
     */
    @Test
    public void union456nd123Than123456() {
        TwoSortedArraysUnited twoSortedArraysUnited = new TwoSortedArraysUnited();
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {1, 2, 3};
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] union = twoSortedArraysUnited.union(arr1, arr2);

        assertThat(union, is(expect));
    }

    /**
     * Test union method.
     *
     */
    @Test
    public void union123And123Than112233() {
        TwoSortedArraysUnited twoSortedArraysUnited = new TwoSortedArraysUnited();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] expect = {1, 1, 2, 2, 3, 3};
        int[] union = twoSortedArraysUnited.union(arr1, arr2);

        assertThat(union, is(expect));
    }

    /**
     * Test union method.
     *
     */
    @Test
    public void union123And345Than123345() {
        TwoSortedArraysUnited twoSortedArraysUnited = new TwoSortedArraysUnited();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};
        int[] expect = {1, 2, 3, 3, 4, 5};
        int[] union = twoSortedArraysUnited.union(arr1, arr2);

        assertThat(union, is(expect));
    }
}
