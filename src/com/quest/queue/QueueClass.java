package com.quest.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;
import java.util.Stack;

public class QueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(9);
        pq.add(5);
        pq.add(7);
        pq.add(8);
        pq.add(4);
//        pq.forEach(System.out::println);
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("a");
        pq2.add("b");
        pq2.add("c");
        pq2.add("d");
//        pq2.add(null);
//        pq2.add(null);
//        pq.forEach(System.out::println);
//        System.out.println(pq.peek());//fcfo
//        System.out.println(pq2.poll());
//        System.out.println(pq2.poll());
//        System.out.println(pq2.offer("e"));
//        System.out.println(pq2.add("f"));//same as offet add elements
//        System.out.println(pq2.remove());//remove first element
//        String[] str = pq2.toArray(new String[pq2.size()]);
        Spliterator<String> str = pq2.spliterator();
        while (str.tryAdvance(System.out::println)) {}
//        System.out.println(pq2.spliterator());
//        System.out.println(pq2.toArray());
        pq.forEach(System.out::println);

       Stack<String> stack = new Stack<>();
       stack.push("a");
       stack.push("b");
       stack.push("c");
       stack.push("d");
        System.out.println(stack.peek());//lcfo

    }
}
