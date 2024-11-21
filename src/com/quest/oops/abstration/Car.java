package com.quest.oops.abstration;

public class Car implements Vehicle {
   String brand;
   String fuelType;
   final int maxPassengers = 7;

     Car(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }
    @Override
    public void displayInfo() {
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Max passengers: " + maxPassengers);
    }

    @Override
    public void honk() {
        System.out.println("Car horn: Beep beep!");
    }

    @Override
    public String toString() {
        return "Car{brand=" + brand + ",  fuelType=" + fuelType + ", maxPassengers=" + maxPassengers + "}";
    }
}
