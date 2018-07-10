package ru.job4j.array;

/**
 * Class "FindLoop" is needed to find element in array.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /**
     * Method "indexOf" is needed to find index of fist equal element in array.
     * @param dataArr array of data
     * @param findElement element, which is searching
     * @return index of first equal element in array, or -1 if there are no elements
     */
    public int indexOf(int[] dataArr, int findElement) {
        int result = -1;

        for (int index = 0; index < dataArr.length; index++)
        {
            if (dataArr[index] == findElement) {
                result = index;
                break;
            }
        }
        return result;
    }
}
