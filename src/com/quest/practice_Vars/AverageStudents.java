package com.quest.practice_Vars;

import java.util.Scanner;

public class AverageStudents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user for the number of students
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        sc.nextLine(); // To consume the newline character after nextInt()

        // Loop for each student
        for (int i = 1; i <= number; i++) {
            // Input the name of the student
            System.out.println("\nEnter the name of student " + i + ": ");
            String name = sc.nextLine();

            // Input the scores for Maths, Science, and English
            System.out.print("Enter the score for Maths (0-100): ");
            int maths = sc.nextInt();
            System.out.print("Enter the score for Science (0-100): ");
            int science = sc.nextInt();
            System.out.print("Enter the score for English (0-100): ");
            int english = sc.nextInt();
            sc.nextLine(); // To consume the newline after nextInt()

            // Calculating the average score
            float avg = (maths + science + english) / 3.0f;
            char grade;
            String feedback;

            // Determining the grade and feedback based on the average score
            if (avg >= 90) {
                grade = 'A';
                feedback = "Excellent performance!";
            } else if (avg >= 80 && avg < 90) {
                grade = 'B';
                feedback = "Good job, but you can aim higher!";
            } else if (avg >= 70 && avg < 80) {
                grade = 'C';
                feedback = "You need to put in more effort!";
            } else if (avg >= 60 && avg < 70) {
                grade = 'D';
                feedback = "Your performance is below expectations. Consider seeking help.";
            } else {
                grade = 'F';
                feedback = "Failure. You need significant improvement.";
            }

            // Printing the results for each student
            System.out.println("\nStudent " + i + " Results:");
            System.out.println("Name: " + name);
            System.out.println("Average Score: " + avg);
            System.out.println("Grade: " + grade);
            System.out.println(feedback);

            // Warning if any subject score is below 60
            if (maths < 60 || science < 60 || english < 60) {
                System.out.println("Warning: Needs improvement in individual subjects.");
            }
        }


    }
}
