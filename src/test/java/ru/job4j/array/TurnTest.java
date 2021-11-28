package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 999};
        int[] result = Turn.back(input);
        int[] expected = new int[] {999, 2, 6, 1, 4};
        assertArrayEquals(expected, result);
    }
}