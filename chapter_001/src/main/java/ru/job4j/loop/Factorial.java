package ru.job4j.loop;

/**
 * Class "Factorial" needs to calculate factorial of a number.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Method "calc" is calculates factorial of a number.
     * @param num the number, of witch factorial is necessary to calculate
     * @return value of the factorial of the num
     */
    public int calc(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return (num >= 0) ? factorial : -1;
    }
}
