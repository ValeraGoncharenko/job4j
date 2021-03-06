package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] l = o1.split("/", 2);
        String[] r = o2.split("/", 2);
        int result = r[0].compareTo(l[0]);
        if (result == 0) {
            result = o1.compareTo(o2);
        }
        return result;
    }
}
