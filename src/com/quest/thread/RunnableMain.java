package com.quest.thread;

public class RunnableMain {
    public static void main(String[] args) {
        Runnableimpl runnable1 = new Runnableimpl();
        Runnableimpl runnable2 = new Runnableimpl();
        Runnableimpl runnable3 = new Runnableimpl();

        Thread t1 = new Thread(runnable1,"HELLO");
        Thread t2 = new Thread(runnable2,"world");
        Thread t3 = new Thread(runnable3,"!");

        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try{
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t3.start();
        try{
            t3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
