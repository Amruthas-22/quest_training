package com.quest.collectionpractice;

import java.util.HashSet;

public class DuplicatesFind {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 1, 4, 2, 5, 3};
        HashSet<Integer> dup = new HashSet<>();

        int firstDuplicate = -1;

        for (int number : numbers) {
            if (dup.contains(number)) {
                firstDuplicate = number;
                break;
            } else {
                dup.add(number);
            }
        }
        if (firstDuplicate != -1) {
            System.out.println("First duplicate: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found");
        }
    }
}
