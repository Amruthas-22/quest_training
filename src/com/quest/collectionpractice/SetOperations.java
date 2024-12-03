package com.quest.collectionpractice;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

                Set<Integer> set1 = new HashSet<>();
                Set<Integer> set2 = new HashSet<>();

                set1.add(1);
                set1.add(2);
                set1.add(3);
                set1.add(4);

                set2.add(3);
                set2.add(4);
                set2.add(5);
                set2.add(6);

                System.out.println("Set 1: " + set1);
                System.out.println("Set 2: " + set2);

                Set<Integer> union = new HashSet<>(set1);
                union.addAll(set2);
                System.out.println("Union: " + union);

                Set<Integer> intersection = new HashSet<>(set1);
                intersection.retainAll(set2);
                System.out.println("Intersection: " + intersection);

                Set<Integer> difference = new HashSet<>(set1);
                difference.removeAll(set2);
                System.out.println("Difference (Set1 - Set2): " + difference);
            }
        }



