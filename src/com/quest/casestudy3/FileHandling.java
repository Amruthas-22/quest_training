package com.quest.casestudy3;
import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
public class FileHandling {


        public static void writeServiceReports(Map<Customer, List<ServiceBooking>> serviceData, String fileName) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                double totalRevenue = 0;
                Set<String> serviceTypes = new HashSet<>();

                for (List<ServiceBooking> bookings : serviceData.values()) {
                    for (ServiceBooking booking : bookings) {
                        totalRevenue += booking.getCost();
                        serviceTypes.add(booking.getServiceType());
                    }
                }

                writer.write("Total Revenue: $" + totalRevenue);
                writer.newLine();

                for (String type : serviceTypes) {
                    long count = 0;
                    for (List<ServiceBooking> bookings : serviceData.values()) {
                        for (ServiceBooking booking : bookings) {
                            if (booking.getServiceType().equals(type)) {
                                count++;
                            }
                        }
                    }
                    writer.write("Service Type: " + type + ", Count: " + count);
                    writer.newLine();
                }

                System.out.println("Service reports written to " + fileName);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }

        public static void readServiceReports(String fileName) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                System.out.println("Service Report:");
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading from file: " + e.getMessage());
            }
        }
    }


