package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
