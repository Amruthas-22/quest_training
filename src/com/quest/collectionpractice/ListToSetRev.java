package com.quest.collectionpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListToSetRev {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

       HashSet<String> set = new HashSet<>(list);

        System.out.println("Set (duplicates removed): " + set);
    }
}
