package com.quest.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class test1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash = new HashMap<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        hash.put(1,"orange");
        hash.put(3,"banana");
        hash.put(5,"apple");
        hash.put(2,"dates");
        hash.put(4,"kiwi");

        treeMap.put(1,"ant");
        treeMap.put(3,"bat");
        treeMap.put(5,"cat");
        treeMap.put(2,"dog");
        treeMap.put(4,"elephant");

//        hash.forEach((k,v)-> System.out.println(k+" "+v));
//        System.out.println("--------");
//        treeMap.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println("$$$$$$$$");

        HashMap<String,String> hash2 = new HashMap<>();
        TreeMap<String,String> treeMap2 = new TreeMap<>();
        LinkedHashMap<String,String> l = new LinkedHashMap<>();

        hash2.put("a","apple");
        hash2.put("c","banana");
        hash2.put("d","orange");
        hash2.put("f","dates");
        hash2.put("k","kiwi");
        hash2.put(null,null);
//        hash2.put("g",null);

        treeMap2.put("a","ant");
        treeMap2.put("t","bat");
        treeMap2.put("c","cat");
        treeMap2.put("e","elephant");
//        treeMap2.put(null,null);
        treeMap2.put("f","horse");

        hash2.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("--------");
        treeMap2.forEach((k,v)-> System.out.println(k+" "+v));

        l.put("a","apple");
        l.put("c","banana");
        l.put("d","orange");
        l.put("f","dates");
        l.put(null,null);
        System.out.println("@@@@@");
        l.forEach((k,v)-> System.out.println(k+" "+v));


    }
}
