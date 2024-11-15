package com.quest.practice_Vars;

import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8};
          Arrays.sort(array);
        System.out.print("Duplicate elements and their positions: ");
         System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println(array[i] + " at position " + i + " and " + (i + 1) + "; ");
            }
        }
    }
}
