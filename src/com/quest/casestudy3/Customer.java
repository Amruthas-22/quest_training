package com.quest.casestudy3;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private Vehicle vehicle;
    private String customerType;

    public Customer(String customerId, String name, String email, Vehicle vehicle, String customerType) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.vehicle = vehicle;
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", vehicle=" + vehicle +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}