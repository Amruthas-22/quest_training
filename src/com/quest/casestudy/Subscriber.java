package com.quest.casestudy;

import java.io.Serializable;
import java.util.List;

public class Subscriber implements Serializable {

     private int id;
     private String name;
     private String phoneNumber;
     private String planType;
     private double balance;
     private List<CallHistory> callRecord;

     public Subscriber(int id, String name, String phoneNumber, String planType, double balance) {
         this.id = id;
         this.name = name;
         this.phoneNumber = phoneNumber;
         this.planType = planType;
         this.balance = balance;

     }
     public int getId() {
         return id;

     }
     public void setId(int id) {
         this.id = id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getPhoneNumber() {
         return phoneNumber;
     }
     public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }
     public String getPlanType() {
         return planType;
     }
     public void setPlanType(String planType) {
         this.planType = planType;
     }
     public double getBalance() {
         return balance;
     }
     public void setBalance(double balance) {
         this.balance = balance;
     }
    public List<CallHistory> getCallHistory() {
         return callRecord;
     }
     @Override
     public String toString() {
         return "ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber + ", Plan: " + planType + ", Balance: ₹" + balance;
     }
     }

