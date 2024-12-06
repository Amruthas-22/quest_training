package com.quest.casestudy2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private List<Vehicle> purchasedVehicles;
    private List<LocalDateTime> purchaseDateTimes;


    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.purchasedVehicles = new ArrayList<>();
        this.purchaseDateTimes = new ArrayList<>();
    }

//    public String getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(String customerId) {
//        this.customerId = customerId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getEmail() {
//        return email;
//    }

//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public List<Vehicle> getPurchasedVehicles() {
//        return purchasedVehicles;
//    }


    public void addPurchasedVehicle(Vehicle vehicle) {
        purchasedVehicles.add(vehicle);
        purchaseDateTimes.add(LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", purchasedVehicles=" + purchasedVehicles +
                '}';
    }
}
