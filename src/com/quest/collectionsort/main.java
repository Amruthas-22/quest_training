package com.quest.collectionsort;

import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
        PriorityQueue<Person> personQueue = new PriorityQueue<>();


        personQueue.add(new Person(1, "Alice", 25));
        personQueue.add(new Person(2, "Bob", 30));
        personQueue.add(new Person(3, "Charlie", 22));
        personQueue.add(new Person(4, "Diana", 28));


        System.out.println("PriorityQueue sorted by age:");
        while (!personQueue.isEmpty()) {
            System.out.println(personQueue.poll());
        }

    }
}
