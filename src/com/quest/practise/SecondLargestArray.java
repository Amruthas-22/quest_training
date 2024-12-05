package com.quest.practise;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargestArray {
    public static void main(String[] args) {

        int[] arr = { 1,5,6,7,3,2};

        Arrays.sort(arr);

        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            }
        }
        System.out.println(secondLargest);
    }
}
