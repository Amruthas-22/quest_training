package com.quest.casestudy2;

import java.time.LocalDate;

public class Bike extends Vehicle {
    private int engineCapacity;
    public Bike(String vehicleId, String brand, String model, double price, LocalDate manufactureDate, int engineCapacity) {
        super(vehicleId, brand, model, price, manufactureDate);
        this.engineCapacity = engineCapacity;
    }
//    public int getEngineCapacity() {
//        return engineCapacity;
//    }
//    public void setEngineCapacity(int engineCapacity) {
//        this.engineCapacity = engineCapacity;
//    }

    @Override
    public String toString() {
        return super.toString() + ", engineCapacity=" + engineCapacity + "cc";
    }
}
