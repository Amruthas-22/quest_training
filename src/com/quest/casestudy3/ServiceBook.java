package com.quest.casestudy3;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ServiceBook implements Serializable, Cloneable{
    private String bookingId;
    private Customer customer;
    private LocalDateTime serviceDate;
    private String serviceType;
    private double cost;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getBookingId() {
        return bookingId;
    }
    public double getCost() {
        return cost;
    }
}
