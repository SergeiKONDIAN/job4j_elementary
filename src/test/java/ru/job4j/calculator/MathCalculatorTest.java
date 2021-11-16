package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MathCalculatorTest {

    @Test
    public void whenSum1AndMultiply2Then6() {
        double first = 1;
        double second = 2;
        double expected = 5;
        double out = MathCalculator.sumAndMultiply(first, second);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenDifference1AndDivide2Then0p5() {
        double first = 1;
        double second = 2;
        double expected = 1 - 2 + (double) 1 / 2;
        double out = MathCalculator.differenceAndDivide(first, second);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when1Sum2AllThen4p5() {
        double first = 1;
        double second = 2;
        double expected = 3 - 1 + 2 + (double) 1 / 2;
        double out = MathCalculator.sumAll(first, second);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}