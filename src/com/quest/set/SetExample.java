package com.quest.set;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(null);

//        for (int i : hashSet) {
//            System.out.println("hashset" +i);
//        }
//        ArrayList<Integer> array = new ArrayList<Integer>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(4);
//        array.add(null);
//        for (int i : array) {
//            System.out.println("array" +i);
//        }
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.remove(2));
        System.out.println(hashSet.equals(4));
        hashSet.clear();
    }
}
