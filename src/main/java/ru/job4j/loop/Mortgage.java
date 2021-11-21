package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double currentYearAmount = amount * (1 + percent / 100) - salary;
        while (currentYearAmount > 0) {
            year++;
            currentYearAmount = currentYearAmount * (1 + percent / 100) - salary;
        }
        return year;
    }
}

