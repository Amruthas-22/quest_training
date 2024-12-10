package com.quest.thread;
public class ThreadExample extends Thread {
    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        ThreadExample t1 = new ThreadExample();
        t.setPriority(1);
        t1.setPriority(2);

        t.start();//start will automatically call the run()
        t1.start();

    }
    public void run2(){
        System.out.println("thread name"+Thread.currentThread().getName());
        System.out.println("priority"+Thread.currentThread().getPriority());
    }
    @Override
    public void run() {
        int i = 1;
        int j = 1;
        int k = i +j ;

        this.run2();
    }
}

