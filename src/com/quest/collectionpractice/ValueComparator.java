package com.quest.collectionpractice;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Map.Entry<Student, Integer>> {
    @Override
    public int compare(Map.Entry<Student, Integer> e1, Map.Entry<Student, Integer> e2) {
        return Integer.compare(e1.getValue(), e2.getValue()); // Ascending order by value
    }
}