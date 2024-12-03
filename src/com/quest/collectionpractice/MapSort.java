package com.quest.collectionpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSort {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 1);
        map.put("apple", 3);
        map.put("grape", 2);
        map.put("cherry", 4);

        System.out.println("Original Map: " + map);

        Map<String, Integer> sortedMap = new TreeMap<>(map);

        System.out.println("Sorted Map by Keys: " + sortedMap);
    }
}
