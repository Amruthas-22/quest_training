package com.quest.queue;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityTree {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        TreeSet<Integer> ts = new TreeSet<>();

        pq.add(2);
        pq.add(10);
        pq.add(3);
//        pq.add(null);
        pq.add(10);

        ts.add(2);
        ts.add(1);
        ts.add(0);
//        ts.add(null);
        ts.add(1);

       pq.forEach(System.out::println);
        System.out.println();
        ts.forEach(System.out::println);
        System.out.println();

    }
}
