package com.quest.practice_Vars;



import java.util.Scanner;

public class CalculatorProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
boolean repeat = true;
        while (true) {
            // Display current result and options
            System.out.println("Current result: " + result);
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Clear");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 :{
                    System.out.print("Enter the number to add: ");
                    double add = sc.nextDouble();
                    result += add;
                }
                case 2 : {
                    System.out.print("Enter the number to subtract: ");
                    double subtract = sc.nextInt();
                    result -= subtract;
                }
                case 3 : {
                    System.out.print("Enter the number to multiply: ");
                    double multiply = sc.nextInt();
                    result *= multiply;
                }
                case 4 : {
                    System.out.print("Enter the number to divide: ");
                    double divide = sc.nextInt();
                    if (divide == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result /= divide;
                    }
                }
                case 5 : {
                    if (result < 0) {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                    } else {
                        result = Math.sqrt(result);
                    }
                }
                case 6 : {
                    result = 0.0;
                    System.out.println("Result cleared.");
                }
                case 7 : {
                    System.out.println("Exiting the calculator.");

                    return; // Exit the program
                }
                default :
                    System.out.println("Invalid choice. Please try again.");
            }

            // Ask if the user wants to continue
            System.out.print("\nDo you want to perform another operation? (yes/no): ");
            String response = sc.next();
            if (response.equalsIgnoreCase("no")) {
                System.out.println("Exiting the calculator.");
                break;
            }
        }


    }
}
