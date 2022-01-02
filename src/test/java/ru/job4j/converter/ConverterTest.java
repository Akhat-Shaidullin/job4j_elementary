package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert120RblThen2Dollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert3EuroThen210Rbl() {
        float in = 3;
        float expected = 210;
        float out = Converter.euroToRuble(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert1DollarThen60Rbl() {
        float in = 1;
        float expected = 60;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }
}