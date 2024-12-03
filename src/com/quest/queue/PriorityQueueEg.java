package com.quest.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEg {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(6);
        pq.add(2);
        pq.add(7);
        pq.add(4);
        pq.add(1);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

        PriorityQueue<Float> pq1 = new PriorityQueue<Float>();
        pq1.add(31.0f);
        pq1.add(4.07f);
        pq1.add(55.05f);
        pq1.add(6.01f);
        pq1.add(73.02f);
        System.out.println("****");
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());
        System.out.println(pq1);

        PriorityQueue<Double> pq2 = new PriorityQueue<Double>();
        pq2.add(17.091d);
        pq2.add(33.0d);
        pq2.add(4.07d);
        pq2.add(55.07d);
        pq2.add(6.01d);
        System.out.println("*****");
        System.out.println(pq2.peek());
        System.out.println(pq2.poll());
        System.out.println(pq2);

        PriorityQueue<Long> pq3 = new PriorityQueue<>();
        pq3 .add(100L);
        pq3 .add(50L);
        pq3 .add(200L);
        pq3 .add(150L);
        System.out.println("*****");
        System.out.println(pq3.peek());
        System.out.println(pq3.poll());
        System.out.println(pq3);

        PriorityQueue<Character> pq4 = new PriorityQueue<>();
        pq4 .add('C');
        pq4.add('A');
        pq4.add('B');
        pq4.add('D');

        System.out.println("****");
        System.out.println(pq4.peek());
        System.out.println(pq4.poll());
        System.out.println(pq4);



    }
}
