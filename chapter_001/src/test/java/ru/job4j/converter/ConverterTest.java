package ru.job4j.converter;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test for "Converter" class.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 *
 * */
public class ConverterTest {
    /**
     * Test for rubleToUSDollar method.
     * 60 Rubles = 1 USDollar
     */
    @Test
    public void when60RublesFor1USDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToUSDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test for rubleToEuro method.
     * 70 Rubles = 1 Euro
     */
    @Test
    public void when70RublesFor1EuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test for usDollarToRubles method.
     * 1 USDollar = 60 Rubles
     */
    @Test
    public void when1USDollarFor60RublesThen60() {
        Converter converter = new Converter();
        int result = converter.usDollarsToRubles(1);
        assertThat(result, is(60));
    }

    /**
     * Test for rubleToEuro method.
     * 1 Euro = 70 Rubles
     */
    @Test
    public void when1EuroFor70RublesThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRubles(1);
        assertThat(result, is(70));
    }



}
