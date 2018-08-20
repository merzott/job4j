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

    int[] union(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int currentIndexArr1 = 0;
        int currentIndexArr2 = 0;

        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (arr1[currentIndexArr1] <= arr2[currentIndexArr2]) {
                union[i] = arr1[currentIndexArr1];
                ++currentIndexArr1;
                if (currentIndexArr1 == arr1.length) {
                    for (int j = currentIndexArr2; j < arr2.length; j++) {
                        union[currentIndexArr1 + j] = arr2[j];
                    }
                    break;
                }
            } else {
                union[i] = arr2[currentIndexArr2];
                ++currentIndexArr2;
                if (currentIndexArr2 == arr2.length) {
                    for (int j = currentIndexArr1; j < arr1.length; j++) {
                        union[currentIndexArr2 + j] = arr1[j];
                    }
                    break;
                }
            }
        }

        return union;
    }

}
