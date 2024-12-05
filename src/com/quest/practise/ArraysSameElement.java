package com.quest.practise;

import java.util.Arrays;

public class ArraysSameElement {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9, 2, 25, 10};
        int[] arr2 = {10, 13, 15, 17, 9, 2, 5, 10};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}

