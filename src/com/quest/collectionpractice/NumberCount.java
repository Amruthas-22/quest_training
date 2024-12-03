package com.quest.collectionpractice;
import java.util.ArrayList;
import java.util.List;

public class NumberCount {
    public static void main(String[] args) {

                List<Integer> numbers = new ArrayList<>();
                numbers.add(10);
                numbers.add(20);
                numbers.add(10);
                numbers.add(30);
                numbers.add(20);
                numbers.add(10);

                System.out.println("List: " + numbers);

                countOccurrences(numbers);
            }

            public static void countOccurrences(List<Integer> list) {

                for (int i = 0; i < list.size(); i++) {
                    int currentElement = list.get(i);

                    boolean alreadyCounted = false;
                    for (int k = 0; k < i; k++) {
                        if (list.get(k) == currentElement) {
                            alreadyCounted = true;
                            break;
                        }
                    }
                    if (alreadyCounted) {
                        continue;
                    }
                    int count = 0;
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j) == currentElement) {
                            count++;
                        }
                    }
                    System.out.println(currentElement + " -> " + count);
                }
            }
        }



