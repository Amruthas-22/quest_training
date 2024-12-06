package com.quest.casestudy2;

import java.io.*;
import java.util.*;

public class SaleManagement {
    private Map<Customer, Set<Vehicle>> salesData = new HashMap<>();
    private Inventory inventory;

    public SaleManagement(Inventory inventory) {
        this.inventory = inventory;
    }
    public void purchase(Customer customer, String vehicleId) throws VehicleNotFoundException { // Updated parameter name

        Vehicle[] vehicles = inventory.getVehicles();

        Optional<Vehicle> optionalVehicle = Arrays.stream(vehicles)
                .filter(vehicle -> vehicle.getVehicleId().equals(vehicleId))
                .findFirst();

        if (optionalVehicle.isPresent()) {
            Vehicle vehicle = optionalVehicle.get();
            customer.addPurchasedVehicle(vehicle);

            inventory.removeVehicle(vehicle);
        } else {
            throw new VehicleNotFoundException("Vehicle with ID " + vehicleId + " not found.");
        }
    }

    public void printMaxPricedVehicle() {
        List<Vehicle> allVehicles = new ArrayList<>();
        for (Set<Vehicle> vehicleSet : salesData.values()) {
            allVehicles.addAll(vehicleSet);
        }
        Optional<Vehicle> maxPricedVehicle = allVehicles.stream()
                .sorted((v1, v2) -> Double.compare(v2.getPrice(), v1.getPrice()))
                .findFirst();
        maxPricedVehicle.ifPresent(vehicle -> System.out.println("Max priced vehicle: " + vehicle));
    }

    public void serializeSalesData() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("salesData.ser"))) {
            oos.writeObject(salesData);
        }
    }

    public void deserializeSalesData() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("salesData.ser"))) {
            salesData = (Map<Customer, Set<Vehicle>>) ois.readObject();
            salesData.forEach((customer, vehicles) -> System.out.println(customer + " -> " + vehicles));
        }
    }
}
