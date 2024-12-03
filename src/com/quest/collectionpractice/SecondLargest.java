package com.quest.collectionpractice;
import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {

                List<Integer> numbers = new ArrayList<>();
                numbers.add(10);
                numbers.add(28);
                numbers.add(4);
                numbers.add(45);
                numbers.add(20);

                System.out.println("List: " + numbers);

                int secondLargest = findSecondLargest(numbers);

                System.out.println("Second largest element: " + secondLargest);
            }

            public static int findSecondLargest(List<Integer> list) {

                int largest = list.get(0);
                int secondLargest = list.get(0);

                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i) > secondLargest) {
                        if (list.get(i) > largest) {
                            secondLargest = largest;
                            largest = list.get(i);
                        } else {
                            secondLargest = list.get(i);
                        }
                    }
                }
                return secondLargest;
            }
        }



