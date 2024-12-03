package com.quest.collectionpractice;

import java.util.*;

public class MainValues {
    public static void main(String[] args) {
        Map<Student, Integer> students = new HashMap<>();
        students.put(new Student("John", 23), 85);
        students.put(new Student("Jane", 24), 60);
        students.put(new Student("Son", 25), 91);
        students.put(new Student("Day", 26), 30);


        List<Map.Entry<Student, Integer>> entryList = new ArrayList<>(students.entrySet());

        entryList.sort(new ValueComparator());

        System.out.println("Sorted Map by Values:");
        for (Map.Entry<Student, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
