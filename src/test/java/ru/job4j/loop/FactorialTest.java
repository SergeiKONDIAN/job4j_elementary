package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialFor10Then3628800() {
        int n = 10;
        int result = Factorial.calc(n);
        int expected = 3628800;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertEquals(expected, result);
    }
}