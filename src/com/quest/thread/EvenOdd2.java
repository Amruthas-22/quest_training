package com.quest.thread;

public class EvenOdd2 extends Thread {


            private static int currentNumber = 1;
            private boolean isOddThread;

            public EvenOdd2(boolean isOddThread) {
                this.isOddThread = isOddThread;
            }

            public static void main(String[] args) {
                EvenOdd oddThread = new EvenOdd(true);
                EvenOdd evenThread = new EvenOdd(false);

                oddThread.setName("OddThread");
                evenThread.setName("EvenThread");

                oddThread.start();
                evenThread.start();
            }

            @Override
            public void run() {

                while (currentNumber <= 10) {
                    if ((isOddThread && currentNumber % 2 == 1) || (!isOddThread && currentNumber % 2 == 0)) {
                        System.out.println("Number: " + currentNumber + " is " + (isOddThread ? "odd" : "even"));
                        currentNumber++;
                    }
                }
            }
        }



