package com.quest.exception;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();

        try {

            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();

            division.division(a, b);

        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e.getLocalizedMessage());
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e.getLocalizedMessage());
        } finally {
            System.out.println("Exception handling is complete.");
        }
    }
}
