package com.quest.thread;

public class Runnableimpl implements Runnable {
//    String name;
//    public Runnableimpl(String name) {
//        this.name = name;
//        thread = new Thread(this,name);
//    }

    @Override
    public void run() {
        System.out.println("thread start :" + Thread.currentThread().getName());
        System.out.println("thread end :" + Thread.currentThread().getPriority());
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("thread interrupted");
        }
        System.out.println("thread end ");

    }
}
