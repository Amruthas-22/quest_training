package com.quest.casestudy;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GenerateBill {

    private final SubcriberManagment management;
    private final Scanner scanner = new Scanner(System.in);

    public GenerateBill(SubcriberManagment management) {
        this.management = management;
    }

    public void addCallRecord() {
        try {
            System.out.print("Enter Subscriber ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            Subscriber subscriber = null;
            // Search for the subscriber directly in the list
            for (Subscriber sub : management.getSubscribers()) {
                if (sub.getId() == id) {
                    subscriber = sub;
                    break;
                }
            }

            if (subscriber != null) {
                System.out.print("Enter Call Type (Local/STD/ISD): ");
                String callType = scanner.nextLine();
                System.out.print("Enter Call Duration (minutes): ");
                int duration = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                System.out.print("Enter Timestamp: ");
                String timestamp = scanner.nextLine();

                CallHistory record = new CallHistory(callType, duration, timestamp);
                subscriber.getCallHistory().add(record);
                System.out.println("Call record added successfully!");
            } else {
                System.out.println("Subscriber not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine();
        }
    }

    public void displayCallHistory() {
        try {
            System.out.print("Enter Subscriber ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Subscriber subscriber = null;
            // Search for the subscriber directly in the list
            for (Subscriber sub : management.getSubscribers()) {
                if (sub.getId() == id) {
                    subscriber = sub;
                    break;
                }
            }

            if (subscriber != null) {
                System.out.println("\n--- Call History ---");
                if (subscriber.getCallHistory() == null || subscriber.getCallHistory().isEmpty()) {
                    System.out.println("No call history found for this subscriber.");
                } else {
                    for (CallHistory record : subscriber.getCallHistory()) {
                        System.out.println(record);
                    }
                }
            } else {
                System.out.println("Subscriber not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Clear buffer
        }
    }

    public void generateBill() {
        try {
            System.out.print("Enter Subscriber ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Subscriber subscriber = null;
            // Search for the subscriber directly in the list
            for (Subscriber sub : management.getSubscribers()) {
                if (sub.getId() == id) {
                    subscriber = sub;
                    break;
                }
            }

            if (subscriber != null && subscriber.getPlanType().equalsIgnoreCase("Postpaid")) {
                if (subscriber.getCallHistory() == null || subscriber.getCallHistory().isEmpty()) {
                    System.out.println("No call history available to generate the bill.");
                    return;
                }

                double totalBill = 0.0;
                for (CallHistory record : subscriber.getCallHistory()) {
                    switch (record.getCallType().toLowerCase()) {
                        case "local":
                            totalBill += record.getDuration();
                            break;
                        case "std":
                            totalBill += record.getDuration() * 2;
                            break;
                        case "isd":
                            totalBill += record.getDuration() * 5;
                            break;
                        default:
                            System.out.println("Unknown call type: " + record.getCallType());
                            break;
                    }
                }
                System.out.println("Total Bill for Subscriber " + id + ": ₹" + totalBill);
            } else {
                System.out.println("Subscriber not found or not on Postpaid plan.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine();
        }
    }
}
