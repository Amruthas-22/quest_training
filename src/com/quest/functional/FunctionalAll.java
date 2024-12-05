package com.quest.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalAll {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Consumer<Integer> multiplyByTwo = (number) -> {
            System.out.println("Transformed: " + (number * 2));
        };
        for (Integer number : numbers) {
            multiplyByTwo.accept(number);
        }

        Predicate<Integer> isEven = (number) -> {
            if(number % 2 == 0){
                return true;
            }else{
                return false;
            }
        };
        for (Integer number : numbers) {
            if (isEven.test(number)) {
                System.out.println(number);
            }
        }
        Supplier<List<Integer>> transformedListSupplier = () -> {
            List<Integer> transformedList = new ArrayList<>();

            for (Integer number : numbers) {
                if (isEven.test(number)) {
                    int transformedNumber = number * 2;
                    transformedList.add(transformedNumber);
                }
            }
            return transformedList;
        };

        List<Integer> transformedNumbers = transformedListSupplier.get();

        transformedNumbers.forEach(multiplyByTwo);

        System.out.println("Final transformed list: " + transformedNumbers);

    }
}
