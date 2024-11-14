package com.quest.practice_Vars;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 4};
        int[] sortedArray = sortArray(array);
        printArray(sortedArray);
    }

    public static int[] sortArray(int[] array) {

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        Arrays.sort(sortedArray);

        return sortedArray;
    }


    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }

}
