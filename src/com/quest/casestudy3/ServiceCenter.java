package com.quest.casestudy3;

import java.util.HashSet;
import java.util.Set;

public class ServiceCenter<T> {
    private Set<T> servicedVehicle;

    public ServiceCenter() {
        this.servicedVehicle = new HashSet<>();
    }

    public void addServicedVehicle(T vehicle) {
        servicedVehicle.add(vehicle);
    }

    public Set<T> getAllServicedVehicles() {
        return servicedVehicle;
    }
}
