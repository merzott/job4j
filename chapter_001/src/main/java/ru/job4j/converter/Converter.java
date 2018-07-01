package ru.job4j.converter;

/**
 * Class "Converter" needs to convert currency.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 * */
public class Converter {

    /**
     * Convert Rubles to Euro.
     * @param rubles Rubles value
     * @return Euro value
     * */
    public int rubleToEuro(int rubles) {
        return rubles / 70;
    }

    /**
     * Convert Rubles to USDollars.
     * @param rubles Rubles value
     * @return USDollars value
     */
    public int rubleToUSDollar(int rubles) {
        return rubles / 60;
    }

    /**
     * Convert Euro to Rubles.
     * @param euro Euro value
     * @return Rubles value
     * */
    public int euroToRubles(int euro) {
        return  euro * 70;
    }

    /**
     * Convert USDollars to Rubles.
     * @param usDollars USDollars value
     * @return Rubles value
     * */
    public int usDollarsToRubles(int usDollars) {
        return usDollars * 60;
    }
}
