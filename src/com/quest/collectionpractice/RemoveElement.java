package com.quest.collectionpractice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class RemoveElement {
    public static void main(String[] args) {

                Set<Integer> set = new HashSet<>();
                set.add(1);
                set.add(2);
                set.add(3);
                set.add(4);
                set.add(5);
                set.add(6);
                set.add(9);

                System.out.println("Original Set: " + set);

                Iterator<Integer> iterator = set.iterator();
                while (iterator.hasNext()) {
                    Integer num = iterator.next();
                    if (num % 3 == 0) {
                        iterator.remove();
                    }
                }

                System.out.println("Updated Set: " + set);
            }
        }



