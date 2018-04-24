package com.company.lesson9;

import java.util.ArrayList;
import java.util.TreeSet;

public class DifCollections {


    public static void col(String[] args) {
        String[] array = "ku-ka-re-ku".split("-");

        System.out.println(array[1]);
        ArrayList<String> list = new ArrayList<>();
        list.add("ku");
        list.add("ka");
        list.add("re");
        list.add("ku");

        System.out.println(list.get(1));

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("apple");
        treeSet.add("butter");
        treeSet.add("cucumber");

    }
}

