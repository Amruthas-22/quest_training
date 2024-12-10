package com.quest.casestudy3;

public class CombustionEngineVehicle extends Vehicle{

    private String fuelType;
    private double engineCapacity;


    public CombustionEngineVehicle(String vin, String brand, String model, int year, double milage, String ownerName,String fuelType,double engineCapacity) {
        super(vin, brand, model, year, milage, ownerName);
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " fuelType :" + fuelType + " engineCapacity :" + engineCapacity;
    }
}
