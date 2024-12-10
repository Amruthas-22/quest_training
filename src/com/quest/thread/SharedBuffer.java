package com.quest.thread;

import java.util.ArrayList;
import java.util.List;

public class SharedBuffer {
    private List<String> buffer;
    private int capacity;

    public SharedBuffer(int capacity) {
        this.buffer = new ArrayList<>(capacity);
        this.capacity = capacity;
    }


    public synchronized void produce(String item) {
        while (buffer.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        buffer.add(item);
        System.out.println("Producer produced: " + item);
         notify();
    }


    public synchronized void consume() {
        while (buffer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String item = buffer.remove(0);
        System.out.println("Consumer consumed: " + item);
        notify();
    }
}
