package com.quest.practice_Vars;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {10, 20, 15, 40, 50};
        Arrays.sort(array);
        int n = array.length;
        int largest = array[n - 1];
        int secondLargest = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] < largest) {
                secondLargest = array[i];
                break;
            }
        }
        if (secondLargest == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
