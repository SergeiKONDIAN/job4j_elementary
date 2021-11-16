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
    public void whenP10K5Square2p27() {
        double expected = 2.27;
        int p = 10;
        int k = 5;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP88K6Square2p96() {
        double expected = 2.96;
        int p = 88;
        double k = 6;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}