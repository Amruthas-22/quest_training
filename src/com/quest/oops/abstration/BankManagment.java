package com.quest.oops.abstration;

import java.util.Scanner;

public class BankManagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount savingsAccount = new SavingsAccount(123, "Alice", 1000);
        BankAccount currentAccount = new CurrentAccount(124, "Bob", 500);


            while (true) {
                System.out.println("\n--- Bank Management System ---");
                System.out.println("1. Deposit to Savings");
                System.out.println("2. Withdraw from Savings");
                System.out.println("3. View Savings Account Details");
                System.out.println("4. Deposit to Current");
                System.out.println("5. Withdraw from Current");
                System.out.println("6. View Current Account Details");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    savingsAccount.deposit(amount);
                } else if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    savingsAccount.withdraw(amount);
                } else if (choice == 3) {
                    savingsAccount.displayAccountDetails();
                } else if (choice == 4) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    currentAccount.deposit(amount);
                } else if (choice == 5) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    currentAccount.withdraw(amount);
                } else if (choice == 6) {
                    currentAccount.displayAccountDetails();
                } else if (choice == 7) {
                    System.out.println("Thank you for using the Bank Management System!");
                    scanner.close();
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
