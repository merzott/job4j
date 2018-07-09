package ru.job4j.array;

/**
 * Class "Square" is needed to calculate square of array values.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Square {
    /**
     * method "calculate" is needed to calculate array with values equal the square of it's values index start from 1
     * @param bound size of array
     * @return int array
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 1; index <= bound; index++) {
            result[index - 1] = index * index;
        }
        return result;
    }

//    public static void main(String[] args) {
//        Square square = new Square();
//        int[] squareArr = square.calculate(10);
//        for(int index = 0; index < 10; index++) {
//            System.out.println(squareArr[index]);
//        }
//    }

}
