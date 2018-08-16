package ru.job4j.array;

import java.util.Arrays;

/**
 * Class "TwoSortedArraysUnited" needs to union two sorted arrays.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */

public class TwoSortedArraysUnited {
    /**
     * Method "union" needs to union two sorted array of int.
     *
     * @param arr1 First sorted array of int
     * @param arr2 Second sorted array of int
     * @return union integer sorted array length with (arr1.length + arr2.length)
     */

// FIRST SOLUTION

    int[] union(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int currentArr1 = 0;
        int currentArr2 = 0;

        if (arr1[0] >= arr2[arr2.length - 1]) {
            for (int i = 0; i < arr2.length; i++) {
                union[i] = arr2[i];
            }
            for (int i = arr2.length; i < arr1.length + arr2.length; i++) {
                union[i] = arr1[i - arr2.length];
            }
        } else if (arr2[0] >= arr1[arr1.length - 1]) {
            for (int i = 0; i < arr1.length; i++) {
                union[i] = arr1[i];
            }
            for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
                union[i] = arr2[i - arr1.length];
            }
        } else {
            for (int i = 0; i < arr1.length + arr2.length; i++) {
                if (arr1[currentArr1] <= arr2[currentArr2]) {
                    union[i] = arr1[currentArr1];
                    ++currentArr1;
                    if (currentArr1 == arr1.length) {
                        for (int j = currentArr2; j < arr2.length; j++) {
                            union[currentArr1 + j] = arr2[j];
                        }
                        break;
                    }
                } else {
                    union[i] = arr2[currentArr2];
                    ++currentArr2;
                    if (currentArr2 == arr2.length) {
                        for (int j = currentArr1; j < arr1.length; j++) {
                            union[currentArr2 + j] = arr1[j];
                        }
                        break;
                    }
                }
            }
        }
        return union;
    }

}
