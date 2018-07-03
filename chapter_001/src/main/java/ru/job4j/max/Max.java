package ru.job4j.max;

/**
 * Class "Max" is needed to find maximum of numbers
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     *  Method "max" is needed to find maximum of two numbers
     *  @param first first number
     *  @param second second number
     *  @return maximum value from first and second
     */
    public int max(int first, int second) {
        return (first >= second ? first : second);
    }

    /**
     * Method maxThreeNum is needed to find maximum of three numbers.
     * @param first first number
     * @param second second number
     * @param third third number
     * @return maximum value from first and second and third
     */
    public int maxThreeNum(int first, int second, int third) {
        return max(max(first, second), third);
    }

}
