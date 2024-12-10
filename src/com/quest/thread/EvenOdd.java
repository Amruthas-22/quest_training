package com.quest.thread;

public class EvenOdd extends Thread {
    private boolean isOddThread;

    public EvenOdd(boolean isOddThread) {
        this.isOddThread = isOddThread;
    }
    public static void main(String[] args) {
        EvenOdd oddThread = new EvenOdd(true);
        EvenOdd evenThread = new EvenOdd(false);

        oddThread.setName("OddThread");
        evenThread.setName("EvenThread");
        oddThread.setPriority(1);
        oddThread.setPriority(2);

        oddThread.start();
        evenThread.start();
    }

    @Override
    public void run() {
        int n = 10;
        if (isOddThread) {
            printOdd(n);
        } else {
            printEven(n);
        }
    }

    public void printOdd(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Thread: " + currentThread().getName() + " Odd: " + i);
        }
    }

    public void printEven(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Thread: " + currentThread().getName() + " Even: " + i);
        }
    }


}