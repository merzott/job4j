package ru.job4j.loop;

/**
 * Class Counter needs to calculate different numbers.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Counter {

    /**
     * Method "add" calculates sum for all even numbers in range from "start" to "finish".
     * @param start start number include in range
     * @param finish finish number include in range
     * @return sum all even numbers from start to finish, or from finish to start(if start > finish)
     */
    public int add(int start, int finish) {
        int result = 0;
        if (start <= finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    result += i;
                }
            }
        } else {
            for (int i = finish; i <= start; i++) {
                if (i % 2 == 0) {
                    result += i;
                }
            }
        }
        return result;
    }

}
