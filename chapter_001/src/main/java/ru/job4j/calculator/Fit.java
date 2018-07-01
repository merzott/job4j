package ru.job4j.calculator;

/**
 * Class "Fit" is needed to calculate ideal male & female weight in depending on their height.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 * */
public class Fit {

    /**
     * calculates ideal weigh for male
     * @param height height in sm
     * @return weight in kg
     * */
    public double maleWeight(double height) {
        return (height - 100D)*1.15;
    }

    /**
     * calculates ideal weigh for female
     * @param height height in sm
     * @return weight in kg
     * */
    public double femaleWeight(double height) {
        return (height - 110D)*1.15;
    }


}
