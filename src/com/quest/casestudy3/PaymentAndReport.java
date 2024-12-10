package com.quest.casestudy3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.io.*;
import java.util.*;


public class PaymentAndReport {
    public static void serializeServiceData(Map<Customer, List<ServiceBooking>> serviceData) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serviceData.ser"))) {
            out.writeObject(serviceData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize the service data
    public static Map<Customer, List<ServiceBooking>> deserializeServiceData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("serviceData.ser"))) {
            return (Map<Customer, List<ServiceBooking>>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

    // Write service reports to file
    public static void writeServiceReports(Map<Customer, List<ServiceBooking>> serviceData) {
        double totalRevenue = 0;
        Map<String, Integer> serviceCount = new HashMap<>();

        for (List<ServiceBooking> bookings : serviceData.values()) {
            for (ServiceBooking booking : bookings) {
                totalRevenue += booking.getCost();
                serviceCount.put(booking.toString(), serviceCount.getOrDefault(booking.toString(), 0) + 1);
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("serviceReports.txt"))) {
            writer.write("Total Revenue: " + totalRevenue + "\n");
            writer.write("Service Counts:\n");
            for (Map.Entry<String, Integer> entry : serviceCount.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read the service reports file
    public static void readServiceReports() {
        try (BufferedReader reader = new BufferedReader(new FileReader("serviceReports.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void calculateAverageServiceCost(Map<Customer, List<ServiceBooking>> serviceData) {
        double electricTotal = 0, combustionTotal = 0;
        int electricCount = 0, combustionCount = 0;

        // Loop over the serviceData map
        for (List<ServiceBooking> bookings : serviceData.values()) {
            for (ServiceBooking booking : bookings) {
                Vehicle vehicle = booking.getCustomer().getVehicle();
                if (vehicle instanceof ElectricVehicle) {
                    electricTotal += booking.getCost();
                    electricCount++;
                } else if (vehicle instanceof CombustionEngineVehicle) {
                    combustionTotal += booking.getCost();
                    combustionCount++;
                }
            }
        }

        System.out.println("Average cost for Electric Vehicles: " + (electricCount == 0 ? 0 : electricTotal / electricCount));
        System.out.println("Average cost for Combustion Engine Vehicles: " + (combustionCount == 0 ? 0 : combustionTotal / combustionCount));
    }


    public static void findCustomerWithMostSpending(Map<Customer, List<ServiceBooking>> serviceData) {
        double maxSpending = 0;
        Customer topCustomer = null;

        for (Map.Entry<Customer, List<ServiceBooking>> entry : serviceData.entrySet()) {
            double totalSpent = 0;
            for (ServiceBooking booking : entry.getValue()) {
                totalSpent += booking.getCost();
            }
            if (totalSpent > maxSpending) {
                maxSpending = totalSpent;
                topCustomer = entry.getKey();
            }
        }

        if (topCustomer != null) {
            System.out.println("Customer who spent the most: " + topCustomer.getName() + " - " + maxSpending);
        }
    }
}
