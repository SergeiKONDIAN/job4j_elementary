package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean isleft = left > right;
        return isleft ? left : right;
    }
}
