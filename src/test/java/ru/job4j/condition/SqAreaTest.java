package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K5Square3dot47() {
        double expected = 3.47;
        int p = 10;
        int k = 5;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP88K6Square237dot06() {
        double expected = 237.06;
        int p = 88;
        double k = 6;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}