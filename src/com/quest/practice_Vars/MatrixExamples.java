package com.quest.practice_Vars;

public class MatrixExamples {
    public static void main(String[] args) {
                int rows = 3;
                int columns = 3;
                int[][] matrix = new int[rows][columns];
                int value = 1;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix[i][j] = value;
                        value++;
                    }
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }




