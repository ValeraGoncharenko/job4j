package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {

        TreeSet<String> tmp = new TreeSet<>();

        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = (el.length() < 3) ? el : start + "/" + el;
                tmp.add(start);
            }
        }
        List<String> rsl = new ArrayList<>(tmp);
        return rsl;
    }


    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }


}


