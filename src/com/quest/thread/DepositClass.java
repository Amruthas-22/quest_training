package com.quest.thread;

public class DepositClass implements Runnable{

    private BankAccount account;
    private double amount;
    private String threadName;

    public DepositClass(BankAccount account, double amount, String threadName) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
    }
    @Override
    public void run() {
        account.deposit(amount, threadName);

    }
}
