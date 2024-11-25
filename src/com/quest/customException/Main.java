package com.quest.customException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = null;
        Manager manager = null;

        while (employee == null) {
            try {
                System.out.println("Enter Employee details:");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                employee = new Employee(name, age, salary);
            } catch (InvalidInputException e) {
                System.out.println("InvalidInputException: " + e.getMessage() );
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException: Invalid data type entered.");
                scanner.nextLine();
            }
        }
        while (manager == null) {
            try {
                System.out.println("\nEnter Manager details:");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Team Size: ");
                int teamSize = scanner.nextInt();
                scanner.nextLine();

                manager = new Manager(name, age, salary, teamSize);
            } catch (InvalidInputException e) {
                System.out.println("InvalidInputException: " + e.getMessage() );
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage() );
                scanner.nextLine();
            }catch (InputMismatchException e) {
                System.out.println("InputMismatchException: Invalid data type entered.");
                scanner.nextLine();
            }
        }
        System.out.println("\nEmployee Details:");
        employee.displayDetails();
        System.out.println("\nManager Details:");
        System.out.println(manager);

    }
}
