package com.quest.collectionpractice;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class MergeList {
    public static void main(String[] args) {

                List<String> list1 = new ArrayList<>();
                list1.add("apple");
                list1.add("banana");
                list1.add("cherry");

                List<String> list2 = new ArrayList<>();
                list2.add("banana");
                list2.add("date");
                list2.add("apple");

                System.out.println("List 1: " + list1);
                System.out.println("List 2: " + list2);

                List<String> mergedList = new ArrayList<>(list1);
                mergedList.addAll(list2);

                List<String> uniqueList = mergedList.stream().distinct()  .toList();

                System.out.println("Merged list (without duplicates): " + uniqueList);
            }
        }
