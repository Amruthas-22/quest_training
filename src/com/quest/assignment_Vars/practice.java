package com.quest.assignment_Vars;

import java.util.Scanner;




public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Please enter 10 integers, one at a time:");

        // Input loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Bubble sort logic
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop
            for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("The sorted array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
