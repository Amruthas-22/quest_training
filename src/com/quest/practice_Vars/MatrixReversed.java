package com.quest.practice_Vars;
import java.util.Scanner;
public class MatrixReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a 3x3 matrix
        int[][] matrix = new int[3][3];

        System.out.println("Enter a 3x3 matrix (row-wise):");

        // Input the matrix elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Reversed matrix (row-wise):");

        // Print the reversed rows
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


