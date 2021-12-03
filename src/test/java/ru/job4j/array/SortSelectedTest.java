package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortOneMore() {
        int[] data = new int[] {5, 4, 1, 2, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Elements() {
        int[] data = new int[] {98, 55, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 55, 98};
        Assert.assertArrayEquals(expected, result);
    }
}