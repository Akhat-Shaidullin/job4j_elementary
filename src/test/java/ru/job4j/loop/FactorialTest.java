package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void henCalculateFactorialForFiveThenOneHundredTwenty() {
        int first = 1;
        int n = 5;
        int result = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int first = 1;
        int n = 0;
        int result = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}