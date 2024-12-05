package com.quest.practise;

public class SwapElements {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int index1 = 0;
        int index2 = 4;

        sort(arr,index1,index2);
    }
    public static void sort(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    }

