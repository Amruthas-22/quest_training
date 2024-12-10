package com.quest.thread;

public class PCMain {
    public static void main(String[] args) {

                SharedBuffer buffer = new SharedBuffer(5);

                Thread producer1 = new Thread(new Producer(buffer), "Producer-1");
                Thread consumer1 = new Thread(new Consumer(buffer), "Consumer-1");

                producer1.start();
                consumer1.start();
//        try {
//            producer1.join();
//            consumer1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("All production and consumption completed.");

            }
        }


