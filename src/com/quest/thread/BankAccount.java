package com.quest.thread;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount, String threadName) {
        balance += amount;
        System.out.println(threadName + " deposited: " + amount);
    }

    public synchronized void withdraw (double amount , String threadName){
        if (amount <= balance) {
            balance -= amount;
            System.out.println(threadName + " withdrew: " + amount);
        } else {
            System.out.println(threadName + " withdrawal failed due to insufficient balance.");
        }
    }

}
