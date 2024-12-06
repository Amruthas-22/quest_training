package com.quest.casestudy2;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Customer customer1 = new Customer("C001", "John Doe", "john.doe@example.com");
        Customer customer2 = new Customer("C002", "Jane Smith", "jane.smith@example.com");

        SaleManagement saleManagement = new SaleManagement(inventory);

        try {
            System.out.println("Initial Inventory:");
            Arrays.stream(inventory.getVehicles()).forEach(System.out::println);

            saleManagement.purchase(customer1, "C001");
            System.out.println("\nCustomer 1 after purchase:");
            System.out.println(customer1);

            saleManagement.purchase(customer2, "B001");
            System.out.println("\nCustomer 2 after purchase:");
            System.out.println(customer2);

            saleManagement.printMaxPricedVehicle();

            saleManagement.serializeSalesData();

            System.out.println("\nDeserialized Sales Data:");
            saleManagement.deserializeSalesData();

        } catch (VehicleNotFoundException | IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("\nVehicles of brand 'BMW':");
        inventory.vehicleByBrand("BMW");


        Vehicle vehicleToRemove = new Car("C002", "Audi", "Q3", 25000, LocalDate.of(2019, 3, 15), 5);
        inventory.removeVehicle(vehicleToRemove);

        System.out.println("\nUpdated Inventory:");
        Arrays.stream(inventory.getVehicles()).forEach(System.out::println);
    }
}
