package com.quest.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> l = new LinkedHashMap<>();
        l.put(1, "car");
        l.put(2, "bike");
        l.put(3, "airplane");
        l.put(4, "lorry");
        l.put(5, "bus");
        System.out.println("PRINTING ALL ELEMENTS :");
        for (Map.Entry<Integer, String> e : l.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        System.out.println("PRINTING ELEMENTS : AFTER ADDING:");
        System.out.println(l.put(5,"cycle"));
        for (Map.Entry<Integer, String> e : l.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        l.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
        System.out.println(l.get(1));
        System.out.println(l.remove(2));
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        l.clear();

    }
}
