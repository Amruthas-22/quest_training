package com.quest.oops.abstration;

public class Withdraw extends Transaction {

    public Withdraw(int amount, BankAccount bankAccount) {
        super(amount, bankAccount);
    }

    @Override
    public void processTransaction() {
        if (amount > 0) {
            if (amount <= bankAccount.getBalance()) {
                bankAccount.withdraw(amount); // Withdraw logic
                System.out.println("Withdrew $" + amount + " from account " + bankAccount.getAccountNumber());
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
