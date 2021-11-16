package ru.job4j.condition;

public class Chessboard {

    public static int way(int x1, int y1, int x2, int y2) {
        boolean rsl = (x1 >= 0 && x2 >= 0 && y1 >= 0 && y2 >= 0) && (Math.abs(x1 - x2) == Math.abs(y1 - y2)) ? true : false;
        return rsl ? Math.abs(x1 - x2) : 0;
    }
}
