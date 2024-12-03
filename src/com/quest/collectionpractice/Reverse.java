package com.quest.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {

        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        System.out.println("Original list: " + originalList);

        List<Integer> reversedList = reverseList(originalList);
        System.out.println("Reversed list: " + reversedList);
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        return reversed;
    }
}
