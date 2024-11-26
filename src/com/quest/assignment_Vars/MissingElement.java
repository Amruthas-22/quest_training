package com.quest.assignment_Vars;

public class MissingElement {
    public static void main(String[] args) {

        int[] series = {2, 8, 14, 18, 22};
        int multiplier = series[1] / series[0];
        System.out.println("Multiplier: " + multiplier);
        for (int i = 0; i < series.length - 1; i++) {
            if (series[i + 1] != series[i] * multiplier) {

                int missingNumber = series[i] * multiplier;
                System.out.println("Missing number between " + series[i] + " and " + series[i + 1] + " is: " + missingNumber);
                break;
            }
        }
    }
}