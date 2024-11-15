package com.quest.practice_Vars;

public class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int result = searchValue(array, target);

        System.out.println("Index of target: " + result);
    }

    public static int searchValue(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
