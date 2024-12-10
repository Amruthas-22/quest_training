package com.quest.thread;

import java.util.ArrayList;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        List<Runnable> transactions = new ArrayList<>();
        transactions.add(new DepositClass(account, 100, "Thread-1"));
        transactions.add(new WithdrawClass(account, 50, "Thread-2"));
        transactions.add(new WithdrawClass(account, 600, "Thread-3"));
        transactions.add(new DepositClass(account, 200, "Thread-4"));

        List<Thread> threads = new ArrayList<>();

        for (Runnable transaction : transactions) {
            Thread thread = new Thread(transaction);
            threads.add(thread);
            thread.start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());

        System.out.println("All transactions have been processed.");




    }
}
