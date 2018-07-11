package ru.job4j.array;

/**
 * Class "Check" is needed to check boolean arrays.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Check {
    /**
     * Method "mono" checks whether the array is completely true or completely false.
     * @param dataArr input boolean array
     * @return true if all elements are true or all elements are false. Otherwise false.
     */
    public boolean mono(boolean[] dataArr) {
        boolean result = true;
        for (int index = 0; index < dataArr.length - 1; index++) {
            if (dataArr[index] != dataArr[index + 1])
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
