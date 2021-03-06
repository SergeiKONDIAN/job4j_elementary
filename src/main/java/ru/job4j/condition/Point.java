package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(-3, -4, 0, 0);
        System.out.println("result (-3, -4) to (0, 0) " + result1);
        double result2 = Point.distance(245, 512, -5, 41132);
        System.out.println("result (245, 512) to (-5, 41132) " + result2);
        double result3 = Point.distance(1, 1, 1, 1);
        System.out.println("result (1, 1) to (1, 1) " + result3);
    }
}
