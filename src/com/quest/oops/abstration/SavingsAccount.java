package com.quest.oops.abstration;

public class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 1000;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of rs" + MINIMUM_BALANCE + " must be maintained.");
        }
    }
}
