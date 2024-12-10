package com.quest.thread;

public class MatrixMultiplication implements Runnable{
    private int[][] A;
    private int[][] B;
    private int[][] C;
    private int row;


    public MatrixMultiplication(int[][] a, int[][] b, int[][] c, int row) {
        A = a;
        B = b;
        C = c;
        this.row = row;
    }

    @Override
    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            for (int k = 0; k < A[0].length; k++) {
                C[row][j] += A[row][k] * B[k][j];
            }

        }
    }
}
