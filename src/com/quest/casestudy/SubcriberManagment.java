package com.quest.casestudy;

import java.util.*;
import java.io.*;

public class SubcriberManagment {
    List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Phone Number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter Plan Type (Prepaid/Postpaid): ");
            String planType = scanner.nextLine();
            System.out.print("Enter Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();

            subscribers.add(new Subscriber(id, name, phone, planType, balance));
            System.out.println("Subscriber added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine();
        }
    }

    public void listSubscribers() {
        for (Subscriber subscriber : subscribers) {
            System.out.println(subscriber);
        }
    }

    public void saveSubscribers() {
        FileOutputStream fileOut = null;
        File file = new File("SUBSCRIBER_FILE.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            fileOut = new FileOutputStream(file);

            for (Subscriber subscriber : subscribers) {
                String line = subscriber.getId() + "," +
                        subscriber.getName() + "," +
                        subscriber.getPhoneNumber() + "," +
                        subscriber.getPlanType() + "," +
                        subscriber.getBalance() + "\n";
                byte[] bytes = line.getBytes();
                fileOut.write(bytes);
            }

            System.out.println("Subscribers saved.");
        } catch (IOException e) {
            System.err.println("Error saving subscribers: " + e.getMessage());
        } finally {
            try {
                if (fileOut != null) {
                    fileOut.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing file output stream: " + e.getMessage());
            }
        }
    }

    public void loadSubscribers() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("SUBSCRIBER_FILE.txt");
            StringBuilder sb = new StringBuilder();
            int c;

            while ((c = fis.read()) != -1) {
                char currentChar = (char) c;
                sb.append(currentChar);

            }
            System.out.println("Subscribers and call records loaded.");
        } catch (IOException e) {
            System.err.println("Error loading subscribers and call records: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.err.println("Error closing file input stream: " + e.getMessage());
            }
        }



    }

    public Subscriber[] getSubscribers() {
        return subscribers.toArray(new Subscriber[subscribers.size()]);
    }
}