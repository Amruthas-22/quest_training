package com.quest.thread;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        threads[0] = new Thread(new FileProcessor("File2.txt"));
        threads[1] = new Thread(new FileProcessor("File4.txt"));
        threads[2] = new Thread(new FileProcessor("File5.txt"));

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All files have been processed.");
    }
}
