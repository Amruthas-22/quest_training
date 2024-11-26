package com.quest.oops.abstration;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 7;
        arr[8] = 9;
        arr[9] = 10;

        boolean[] isPresent = new boolean[10];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= 1 && num <= 10) {
                isPresent[num - 1] = true;
            }
        }

        System.out.println("Missing numbers:");
        for (int i = 0; i < isPresent.length; i++) {
            if (!isPresent[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
