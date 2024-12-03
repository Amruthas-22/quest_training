package com.quest.casestudy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SubcriberManagment subscriberManagement = new SubcriberManagment();
        GenerateBill generateBill = new GenerateBill(subscriberManagement);
//        File file = new File("SUBSCRIBER_FILE.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("File created: " + file.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred while creating the file.");
//            e.printStackTrace();
//        }

        while (true) {
            System.out.println("\n--- Subscriber Management System ---");
            System.out.println("1. Add Subscriber");
            System.out.println("2. List Subscribers");
            System.out.println("3. Add Call Record");
            System.out.println("4. Display Call History");
            System.out.println("5. Generate Bill");
            System.out.println("6. Save Subscribers");
            System.out.println("7. Load Subscribers");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    subscriberManagement.addSubscriber();
                    break;
                case 2:
                    subscriberManagement.listSubscribers();
                    break;
                case 3:
                    generateBill.addCallRecord();
                    break;
                case 4:
                    generateBill.displayCallHistory();
                    break;
                case 5:
                    generateBill.generateBill();
                    break;
                case 6:
                    subscriberManagement.saveSubscribers();
                    break;
                case 7:
                    subscriberManagement.loadSubscribers();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
