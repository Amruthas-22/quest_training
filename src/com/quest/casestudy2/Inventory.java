package com.quest.casestudy2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Inventory {
     private Vehicle[] vehicles;
     public Inventory() {
         vehicles = new Vehicle[]{
                 new Car("C001", "BMW", "M5", 30000, LocalDate.of(2020, 5, 10), 5),
                 new Car("C002", "Audi", "Q3", 25000, LocalDate.of(2019, 3, 15), 5),
                 new Car("C003", "Tesla", "Model 3", 40000, LocalDate.of(2021, 7, 20), 5),
                 new Bike("B001", "Yamaha", "MT-15", 1500, LocalDate.of(2018, 1, 25), 155),
                 new Bike("B002", "KTM", "Duke 200", 2000, LocalDate.of(2020, 9, 30), 200)
         };
     }
     public Vehicle[] getVehicles() {
         return vehicles;
     }
    public void vehicleByBrand(String brand) {
        List<Vehicle> vehicleBrand = Arrays.stream(vehicles)
                .filter(vehicle -> vehicle.getBrand().equalsIgnoreCase(brand))
                .toList();
        vehicleBrand.forEach(vehicle -> System.out.println(vehicle));
    }

    public void removeVehicle(Vehicle vehicle) {
        int indexToRemove = -1;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getVehicleId().equals(vehicle.getVehicleId())) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            System.out.println("Vehicle with ID " + vehicle.getVehicleId() + " not found.");
            return;
        }

        Vehicle[] updatedVehicles = new Vehicle[vehicles.length - 1];
        int j = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (i != indexToRemove) {
                updatedVehicles[j++] = vehicles[i];
            }
        }
        vehicles = updatedVehicles;
        System.out.println("Vehicle " + vehicle.getVehicleId() + " removed from inventory.");
    }

}
