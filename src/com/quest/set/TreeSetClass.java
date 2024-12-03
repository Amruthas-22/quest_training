package com.quest.set;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> tc = new TreeSet<Integer>();
        tc.add(1);
        tc.add(2);
        tc.add(3);
        tc.add(4);
        for(int i : tc){
            System.out.println(i);
        }
//        System.out.println(tc.first());
//        System.out.println(tc.last());
//        System.out.println(tc.descendingSet());
       System.out.println(tc.floor(2));//later
//        System.out.println(tc.headSet(tc.size(),false));


    }
}
