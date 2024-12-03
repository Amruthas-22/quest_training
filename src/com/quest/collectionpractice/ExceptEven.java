package com.quest.collectionpractice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptEven {
    public static void main(String[] args) {

              List<Integer> numbers = new ArrayList<>();

                numbers.add(1);
                numbers.add(2);
                numbers.add(3);
                numbers.add(4);
                numbers.add(5);
                numbers.add(6);

                System.out.println("Original list: " + numbers);

                List<Integer> filteredList = numbers.stream().filter(num -> num % 2 != 0) .toList();

                System.out.println("Updated list (no even numbers): " + filteredList);
            }
        }


