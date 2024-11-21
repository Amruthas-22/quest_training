package com.quest.oops.abstration;

public class Deposit extends Transaction {

    public Deposit(int amount, BankAccount bankAccount) {
        super(amount, bankAccount);
    }

    @Override
    public void processTransaction() {
        if (amount > 0) {
            bankAccount.deposit(amount); // Deposit logic
            System.out.println("Deposited $" + amount + " into account " + bankAccount.getAccountNumber());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}
