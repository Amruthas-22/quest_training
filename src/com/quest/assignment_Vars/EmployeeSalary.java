package com.quest.assignment_Vars;
import java.util.InputMismatchException;
import java.util.Scanner;

class Employee {
    private String empName; // Stores employee's name
    private int empBaseSalary; // Stores employee's base salary
    private int[] monthlySalaries = new int[12]; // Array to hold monthly salaries

    // Constructor to initialize employee name and base salary
    public Employee(String name, int baseSalary) {
        empName = name;
        empBaseSalary = baseSalary;
    }

    // Sets monthly salaries with an increment for each month
    public void setMonthlySalaries(int incrementValue) {
        for (int month = 0; month < 12; month++) {
            // Calculate salary for each month with a cumulative increment
            monthlySalaries[month] = empBaseSalary + (incrementValue * (month + 1));
        }
    }

    // Calculates total salary for the year by summing up all monthly salaries
    public int calculateTotalSalary() {
        int total = 0;
        for (int month = 0; month < 12; month++) {
            total += monthlySalaries[month];
        }
        return total;
    }

    // Calculates average monthly salary by dividing total salary by 12
    public int calculateAverageMonthlySalary() {
        return calculateTotalSalary() / 12;
    }

    // Prints the detailed salary report for the employee
    public void printReport() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Base Salary: " + empBaseSalary);
        System.out.println("Monthly Salary Breakdown:");
        for (int month = 0; month < 12; month++) {
            System.out.println("  Month " + (month + 1) + ": " + monthlySalaries[month]);
        }
        System.out.println("Total Salary for the Year: " + calculateTotalSalary());
        System.out.println("Average Monthly Salary: " + calculateAverageMonthlySalary());
        System.out.println();
    }

    // Method to get valid integer input
    public static int getValidIntegerInput(Scanner scanner) {
        int validInput = 0;
        boolean valid = false;

        while (!valid) {
            try {
                validInput = scanner.nextInt(); // Try to read an integer from user input
                if (validInput <= 0) { // Check if the input is positive
                    System.out.println("Error: The value must be a positive number greater than zero.");
                } else {
                    valid = true; // If valid, exit the loop
                }
            } catch (InputMismatchException e) { // If the input is not an integer
                System.out.println("Error: Please enter a valid integer.");
                scanner.nextLine(); // Clear the invalid input from scanner buffer
            }
        }
        return validInput; // Return the valid input after loop
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = Employee.getValidIntegerInput(scanner); // Get valid integer input for number of employees

        // Get the increment value for monthly salaries
        System.out.print("Enter the increment value to add to each month's salary: ");
        int incrementValue = Employee.getValidIntegerInput(scanner); // Get valid integer input for increment value

        Employee[] employees = new Employee[numEmployees];
        int totalAllEmployeesSalary = 0;

        for (int i = 0; i < numEmployees; i++) {
            // Input employee name
            scanner.nextLine(); // Clear the buffer before reading a new line of input
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();

            // Get the base salary for the employee
            System.out.print("Enter the base salary for " + name + ": ");
            int baseSalary = Employee.getValidIntegerInput(scanner); // Get valid integer input for base salary

            // Create Employee object and set monthly salaries with increment
            Employee employee = new Employee(name, baseSalary);
            employee.setMonthlySalaries(incrementValue);
            employees[i] = employee;

            // Add employee's total yearly salary to the total for all employees
            totalAllEmployeesSalary += employee.calculateTotalSalary();
        }

        // Print employee salary report
        System.out.println("\n--- Employee Salary Report ---");
        for (int i = 0; i < employees.length; i++) {
            employees[i].printReport();
        }

        // Calculate and display the average salary for all employees
        double averageAllEmployeesSalary = (double) totalAllEmployeesSalary / numEmployees;
        System.out.printf("Average Salary for All Employees: %.2f\n", averageAllEmployeesSalary);

        scanner.close();
    }
}
