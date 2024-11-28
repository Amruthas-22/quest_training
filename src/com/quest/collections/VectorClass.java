package com.quest.collections;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println(v.get(0));
        System.out.println(v.size());
        System.out.println(v.add(0));
        System.out.println(v.contains(2));
        System.out.println(v.isEmpty());
        System.out.println(v.remove(0));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
    }
}
