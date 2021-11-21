package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        int dividerNum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dividerNum++;
            }
        }
        return dividerNum == 2;
    }
}
