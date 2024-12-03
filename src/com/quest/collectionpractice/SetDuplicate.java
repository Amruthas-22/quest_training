package com.quest.collectionpractice;

import java.util.HashSet;

public class SetDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 6, 7, 8};

        Integer firstDuplicate = findFirstDuplicate(numbers);

        if (firstDuplicate != null) {
            System.out.println("First duplicate: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found");
        }
    }

    public static Integer findFirstDuplicate(int[] numbers) {
        HashSet<Integer> duplicate = new HashSet<>();

        for (int num : numbers) {
            if (duplicate.contains(num)) {
                return num;
            } else {
                duplicate.add(num);
            }
        }
        return 0;
    }
}



