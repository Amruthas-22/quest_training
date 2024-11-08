package com.quest.practice_Vars;

public class ControlFlow {
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("number is positive: " + number);
        } else if (number < 0) {
            System.out.println("number is negative: " + number);
        } else {
            System.out.println("number is zero: " + number);
        }

        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Calling the methods
        testForLoop();
        testForWhile();
    }

    // Method to print "even" for even numbers from 0 to 20
    private static void testForLoop() {
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println("even");
            }
        }
    }

    // Method to print numbers from 5 to 10
    private static void testForWhile() {
        int i = 5;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
