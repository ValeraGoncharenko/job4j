package ru.job4j.sort;

import java.util.Arrays;
//Так как оба массива отсортированы по возрастанию, то минимальный элемент всегда будет первым.
//
//Смысл решения сводится к сравнению первых элементов массива.
// Полученный элемент мы вставляем в третий массив. Далее операция сравнения повторяется, но сравнение уже идет с первый элементов и нулевым. 
//
//Вам нужно сделать два индекса, которые указывает на текущий элемент. 
// При выборе минимального элемента указатель сдвигается на один элемент вперед.
//Здесь нужно использовать цикл while.

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (l < left.length && r < right.length) {
                    if (left[l] < right[r]) {
                        rsl[i] = left[l++];
                    } else {
                        rsl[i] = right[r++];
                    }
                } else if (l < left.length) {
                        rsl[i] = left[l++];
                    } else if (r < right.length) {
                        rsl[i] = right[r++];
                    }


        }





        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
