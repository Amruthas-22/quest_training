package com.quest.thread;

public class WithdrawClass implements Runnable{
    private BankAccount account;
    private double amount;
    private String threadName;

    public WithdrawClass(BankAccount account, double amount, String threadName) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
    }
    @Override
    public void run() {
        account.withdraw(amount, threadName);
    }
}
