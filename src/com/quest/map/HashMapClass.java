package com.quest.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        h.put(1, "orange");
        h.put(2, "kiwi");
        h.put(3, "mango");
        h.put(4, "cherry");
        h.put(5, "apple");
        for (String str : h.values()) { // FOR VALUES OF VALUE
            System.out.println(str);
        }
        for (Integer i : h.keySet()) { //FOR VALUE OF KEY
            System.out.println(i);
        }
        System.out.println(h.put(5,"dates"));
        for(Map.Entry<Integer, String> e : h.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());// GET VALUE OF KEY AND VALUE
        }
        System.out.println(h.get(1));
        System.out.println(h.remove(2));
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        h.clear();

    }
}
