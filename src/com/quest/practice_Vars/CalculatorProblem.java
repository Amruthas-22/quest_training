package com.quest.practice_Vars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double result = 0.0;  // Initialize result to 0

        while (true) {  // Infinite loop to keep the calculator running until the user exits
            // Display the current result and options for the user
            System.out.println("\nCurrent result: " + result);
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Clear");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();  // Read the user's choice

                // Perform the appropriate operation based on the user's choice
                switch (choice) {
                    case 1: {  // Addition operation
                        System.out.print("Enter the number to add: ");
                        double add = sc.nextDouble();
                        result += add;  // Add the number to the result
                        System.out.println("Updated result after addition: " + result);
                        break;
                    }
                    case 2: {  // Subtraction operation
                        System.out.print("Enter the number to subtract: ");
                        double subtract = sc.nextDouble();
                        result -= subtract;  // Subtract the number from the result
                        System.out.println("Updated result after subtraction: " + result);
                        break;
                    }
                    case 3: {  // Multiplication operation
                        System.out.print("Enter the number to multiply: ");
                        double multiply = sc.nextDouble();
                        result *= multiply;  // Multiply the result by the entered number
                        System.out.println("Updated result after multiplication: " + result);
                        break;
                    }
                    case 4: {  // Division operation
                        System.out.print("Enter the number to divide: ");
                        double divide = sc.nextDouble();
                        if (divide == 0) {  // Check if the number is zero to prevent division by zero
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result /= divide;  // Divide the result by the entered number
                            System.out.println("Updated result after division: " + result);
                        }
                        break;
                    }
                    case 5: {  // Square root operation
                        if (result < 0) {  // Check if the result is negative
                            System.out.println("Error: Cannot calculate square root of a negative number.");
                        } else {
                            result = Math.sqrt(result);  // Calculate the square root of the result
                            System.out.println("Updated result after square root: " + result);
                        }
                        break;
                    }
                    case 6: {  // Clear the result
                        result = 0.0;  // Reset the result to zero
                        System.out.println("Result cleared. Current result: " + result);
                        break;
                    }
                    case 7: {  // Exit the program
                        System.out.println("Exiting the calculator.");
                        return;
                    }
                    default:  // If the user enters an invalid choice
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {  // Exception handling for invalid input (non-numeric)
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();  // Clear the invalid input from the scanner buffer
                continue;  // Prompt the user for a valid input again
            }

            // Ask the user if they want to perform another operation
            System.out.print("\nDo you want to perform another operation? (yes/no): ");
            String response = sc.next();
            if (response.equalsIgnoreCase("no")) {  // Exit if the user says "no"
                System.out.println("Exiting the calculator.");
                break;  // Break the loop and end the program
            }
        }

    }
        }
