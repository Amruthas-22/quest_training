package com.quest.oops.abstration;

public class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 2000;
    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit of rs" + OVERDRAFT_LIMIT + " exceeded.");
        }
    }
}
