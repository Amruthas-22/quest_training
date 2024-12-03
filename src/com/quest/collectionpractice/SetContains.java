package com.quest.collectionpractice;
import java.util.HashSet;
import java.util.Set;

public class SetContains {
    public static void main(String[] args) {

                Set<Integer> set1 = new HashSet<>();
                Set<Integer> set2 = new HashSet<>();

                set1.add(1);
                set1.add(2);
                set1.add(3);
                set1.add(4);

                set2.add(2);
                set2.add(3);

                boolean result = set1.containsAll(set2);

                if (result) {
                    System.out.println("set1 contains all elements of set2");
                } else {
                    System.out.println("set1 does not contain all elements of set2");
                }
            }
        }



