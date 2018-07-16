package ru.job4j.array;

import java.util.Arrays;

/**
 * Class "ArrayDuplicate" is needed to remove duplicate from string array.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * Method "remove" is needed to remove duplicate from string array and get array with unique elements
     *
     * @param array input String array
     * @return array with unique elements
     */
    String[] remove(String[] array) {
        int numOfMatches = 0;
        for (int i = 0; i < array.length - 1 - numOfMatches; i++) {
            // for each element from 0 to (penultimate - deleted)
            for (int j = i + 1; j < array.length - numOfMatches; j++) {
                // for each element from next after i to (ultimate - deleted)
                if (array[i].equals(array[j])) {
                    numOfMatches++;
                    for (int k = j; k < array.length - numOfMatches; k++) {
                        // deleting element by moving array
                        array[k] = array[k + 1];
                    }
                    j--; // return cycle one step back, because array moved
                }
            }
        }
//        System.out.println(numOfMatches);
//        System.out.println(array.length - numOfMatches);
        return Arrays.copyOf(array, array.length - numOfMatches);
    }


}
