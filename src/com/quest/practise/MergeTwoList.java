package com.quest.practise;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("E");
        list2.add("F");
        list2.add("G");
        list2.add("H");

        List<String> mergedList1 = new ArrayList<>(list1);
        mergedList1.addAll(list2);

        System.out.println("Merged List using addAll(): " + mergedList1);


    }
}
