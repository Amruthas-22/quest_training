package com.quest.thread;

public class Producer implements Runnable {

    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int itemCount = 1;
        while (true) {
            String item = "Item" + itemCount++;
            buffer.produce(item);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
