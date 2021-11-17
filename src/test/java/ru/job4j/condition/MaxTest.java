package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1000To20Then1000() {
        int left = 1000;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 1000;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenEqual() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        assertEquals(result, expected);
    }
}