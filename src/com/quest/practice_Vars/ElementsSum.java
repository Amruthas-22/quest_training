package com.quest.practice_Vars;

import java.util.Arrays;

public class ElementsSum {
    public static void main(String[] args) {

        int[] ar = {2, 4, 5, 7, 8};
        int totalSum = 0;

        for (int i = 0; i < ar.length; i++) {
            totalSum += ar[i];
        }

        for (int i = 0; i < ar.length; i++) {
            int temp = ar[i];
            ar[i] = totalSum - temp;
        }

        System.out.println(Arrays.toString(ar));
    }
}




