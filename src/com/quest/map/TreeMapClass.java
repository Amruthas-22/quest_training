package com.quest.map;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("John", "Andrew");
        map.put("Eric", "Richard");
        map.put("mad", "John");
        map.put("ann","james");
        map.put("sam","jack");
        map.forEach((k,v) -> System.out.println(k + ": " + v));
        System.out.println(map.size());
        System.out.println(map.replace("Eric", "Richard","ram"));

        System.out.println("--------");

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "car");
        map2.put(2, "bus");
        map2.put(3, "aeroplane");
        map2.put(4, "lorry");
        map2.put(5, "cycle");

        map.forEach((k,v) -> System.out.println(k + ": " + v));
        System.out.println(map2.remove(2,"bus"));
        System.out.println(map2.ceilingEntry(4).getValue());
        System.out.println(map2.isEmpty());


    }
}
