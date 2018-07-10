package ru.job4j.array;

/**
 * Class "Turn" is needed to rearrange the array.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Turn {

    /**
     * Method back is rearranging the input array.
     * @param dataArr input data array
     * @return rearranged data array
     */
    public int[] back(int[] dataArr) {
        int tmp;
        int indexMax = dataArr.length - 1;

        for (int index = 0; index < dataArr.length / 2; index++) {
            tmp = dataArr[index];
            dataArr[index] = dataArr[indexMax - index];
            dataArr[indexMax - index] = tmp;
        }

        return dataArr;
    }

}
