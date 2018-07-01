package ru.job4j.calculator;

/**
 *  Class Calculator.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    private double result;

    /**
     * Method "add" needs to sum two numbers
     * @param first number
     * @param second number
     * returns first + second
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method "mul" needs to multiply two numbers
     * @param first number
     * @param second number
     * returns first * second
     * */
    public void mul(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method "sub" needs to subtract second number from first
     * @param first number
     * @param second number
     * returns first - second
     * */
    public void sub(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method "div" needs to divide first number to second
     * @param first number
     * @param second number
     * result first / second
     * */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method getResult needs to take result param from class
     * */
    public double getResult() {
        return this.result;
    }
}