package com.quest.oops.abstration;

public class VehicleMain {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Petrol");

        System.out.println("Displaying Car Information:");
        myCar.displayInfo();

        System.out.println("\nHonk Test:");
        myCar.honk();

        System.out.println("\nCar toString Method:");
        System.out.println(myCar.toString());
    }

}
