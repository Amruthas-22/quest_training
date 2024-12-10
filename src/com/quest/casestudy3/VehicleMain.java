package com.quest.casestudy3;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class VehicleMain {
    public static void main(String[] args) {

        ElectricVehicle ev1 = new ElectricVehicle("EV001", "BMW", "i3", 2018, 60000, "Alice", 42.2, 150);
        ElectricVehicle ev2 = new ElectricVehicle("EV002", "BMW", "i8", 2016, 30000, "Bob", 22.5, 120);
        CombustionEngineVehicle cv1 = new CombustionEngineVehicle("CV001", "BMW", "3 Series", 2014, 80000, "Charlie", "Diesel", 2.0);
        CombustionEngineVehicle cv2 = new CombustionEngineVehicle("CV002", "BMW", "X5", 2020, 15000, "David", "Petrol", 3.0);

        Customer customer1 = new Customer("C123", "Alice", "alice@example.com", ev1, "VIP");
        Customer customer2 = new Customer("C124", "Bob", "bob@example.com", cv1, "Regular");

        ServiceCenter<ElectricVehicle> evCenter = new ServiceCenter<>();
        evCenter.addServicedVehicle(ev1);
        evCenter.addServicedVehicle(ev2);

        ServiceCenter<CombustionEngineVehicle> cvCenter = new ServiceCenter<>();
        cvCenter.addServicedVehicle(cv1);
        cvCenter.addServicedVehicle(cv2);

        List<Vehicle> allVehicles = new ArrayList<>();
        allVehicles.addAll(evCenter.getAllServicedVehicles());
        allVehicles.addAll(cvCenter.getAllServicedVehicles());

        Predicate<Vehicle> milageFilter = v -> v.getMileage() > 50000;
        System.out.println("Vehicles with mileage > 50,000 km:");
        allVehicles.stream().filter(milageFilter).forEach(System.out::println);

        Predicate<Vehicle> yearFilter = v -> v.getYear() < 2015;
        System.out.println(" vehicles with yr < 2015");
        allVehicles.stream().filter(yearFilter).forEach(System.out::println);

        Consumer<Vehicle> printVehicle = v -> System.out.println("VIN: " + v.getVin() + ", Mileage: " + v.getMileage());
        System.out.println("\nVehicle details (custom format):");
        allVehicles.forEach(printVehicle);

        Supplier<Vehicle> randomVehicleSupplier = () -> {
            if (Math.random() > 0.5) {
                return new ElectricVehicle(
                        "EV" + (int) (Math.random() * 1000), "BMW", "RandomModel", 2023, Math.random() * 1000,
                        "RandomOwner", 50.0, 300.0
                );
            } else {
                return new CombustionEngineVehicle(
                        "CV" + (int) (Math.random() * 1000), "BMW", "RandomModel", 2023, Math.random() * 1000,
                        "RandomOwner", "Petrol", 2.0
                );
            }
        };
        System.out.println("\nRandom Vehicle: " + randomVehicleSupplier.get());


        Function<Vehicle, Double> calculateResaleValue = v -> {
            double originalPrice = 50000.0;
            double depreciationRate = 2000.0;
            int yearsUsed = 2024 - v.getYear();
            return originalPrice - (depreciationRate * yearsUsed);
        };

        System.out.println("\nResale values of vehicles:");
        allVehicles.stream().forEach(v -> System.out.println(v.getVin() + " - Resale Value: " + calculateResaleValue.apply(v)));

        ServiceBooking booking1 = new ServiceBooking("B001", customer1, LocalDateTime.now().plusDays(5), "Battery Check", 150.0);
        ServiceBooking booking2 = new ServiceBooking("B002", customer1, LocalDateTime.now().plusDays(5), "oil Check", 250.0);
        CustomerServiceManager manager = new CustomerServiceManager();


        try {
            manager.addBooking(customer1, booking1);
            System.out.println("Booking added successfully.");
        } catch (InvalidBookingException e) {
            System.err.println("Error: " + e.getMessage());
        }

        manager.addRandomBooking(() -> new ServiceBooking("B002", customer1, LocalDateTime.now().plusDays(3), "Oil Change", 80.0));
        manager.printInvoices();

        manager.applyDiscountForFrequentCustomers();

        manager.addRandomBooking(() -> new ServiceBooking("B002", customer1, LocalDateTime.now().plusDays(3), "Oil Change", 80.0));

        Map<Customer, List<ServiceBooking>> serviceData = new HashMap<>();
        serviceData.put(customer1, new ArrayList<>(List.of(booking1)));
        serviceData.put(customer2, new ArrayList<>(List.of(booking2)));

        Serialisation.serializeServiceData(serviceData, "serviceData.ser");
        Map<Customer, List<ServiceBooking>> deserializedData = Serialisation.deserializeServiceData("serviceData.ser");

        FileHandling.writeServiceReports(deserializedData, "serviceReports.txt");

        FileHandling.readServiceReports("serviceReports.txt");

        PaymentAndReport.calculateAverageServiceCost(deserializedData);

        PaymentAndReport.findCustomerWithMostSpending(deserializedData);

        PaymentAndReport.serializeServiceData(serviceData);

        Map<Customer, List<ServiceBooking>> newServiceData = PaymentAndReport.deserializeServiceData();
        System.out.println("Deserialized service data: " + newServiceData);

    }



}


