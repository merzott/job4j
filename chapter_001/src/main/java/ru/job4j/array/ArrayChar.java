package ru.job4j.array;

/**
 * Class "ArrayChar" is needed to compare Strings
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {
    private char[] data;

    /**
     * Constructor for "ArrayChar" object.
     * @param line String line
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Method "startWithPrefix" is needed to identify if string starts with prefix.
     * @param prefix String value to compare with start of the line
     * @return true if line starts with "prefix"
     */
    public boolean startWithPrefix(String prefix) {
        boolean result = true;
        char[] prefixArr = prefix.toCharArray();
        if (prefixArr.length <= this.data.length) {
            for (int index = 0; index < prefixArr.length; index++) {
                if (this.data[index] != prefixArr[index]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
