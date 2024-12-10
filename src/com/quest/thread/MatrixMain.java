package com.quest.thread;

public class MatrixMain {
    public static void main(String[] args) {
        int[][] A = {
                {2, 4},
                {3, 4},
                {1, 2}
        };

        int[][] B = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int rows = A.length;
        int cols = B[0].length;
        int[][] C = new int[rows][cols];

        Thread[] threads = new Thread[rows];
        for (int i = 0; i < rows; i++) {
            threads[i] = new Thread(new MatrixMultiplication(A, B, C, i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Resultant Matrix C:");
        for (int[] row : C) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
