package com.quest.map;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class test2 {
    public static void main(String[] args) {

        HashMap<Double,String> hash2 = new HashMap<>();
        TreeMap<Float, Integer> treeMap2 = new TreeMap<>();
        LinkedHashMap<Boolean,String> l = new LinkedHashMap<>();

        hash2.put(1.0,"apple");
        hash2.put(10.00,"banana");
        hash2.put(14.234,"orange");
        hash2.put(16.75,"dates");
        hash2.put(18.5,"kiwi");
        hash2.put(null,null);
//        hash2.put("g",null);

        treeMap2.put(1.0F,1);
        treeMap2.put(0.2F,10);
        treeMap2.put(9.8F,12);
        treeMap2.put(5.3F,6);
//        treeMap2.put(null,null);
        treeMap2.put(1.2F,9);

        l.put(true,"apple");
        l.put(false,"banana");
        l.put(true,"orange");
        l.put(false,"dates");
        l.put(null,null);

        hash2.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println(hash2.get(1));
        System.out.println(hash2.remove(2));
        System.out.println(hash2.size());
        System.out.println(hash2.isEmpty());
        hash2.clear();

        System.out.println("--------");
        treeMap2.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println(treeMap2.size());
        System.out.println(treeMap2.remove(0.2F,10));
        System.out.println(treeMap2.ceilingEntry(0.2F).getValue());
        System.out.println(treeMap2.isEmpty());

        System.out.println("@@@@@");
        l.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println(l.get(true));
        System.out.println(l.remove(false));
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        l.clear();


    }
}




