package ru.job4j.loop;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент массива names с "
                    + "номером " + i + ":" + numbers[i]);
        }

        System.out.println();

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
