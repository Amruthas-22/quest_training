package com.quest.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);

        Stream<Integer> max = numbers.stream();

        Stream<Integer> integerStream = Stream.of(1,3,5,7,9,10);

        Optional<Integer> first = integerStream.sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first.get());

        // if number is repeat
        Optional<Integer> first1 = integerStream.distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        Consumer<Integer> consumer = i ->{
            if(i%2==0){
                System.out.println(i);
            }else{
                System.out.println("not even");
            }

        };
        integerStream.peek(consumer).forEach(i -> { // functional style iteration and  to call the method of consumer for every element in iterartion

        });
//        Predictor<Integer> integerPredictor = (i) -> i % 2 ==0;
//        boolean b = integerStream.anyMatch(integerPredictor);
//
//        integerStream.allMatch(integer -> {
//            return integer % 2 == 0;
//        });

    }
}
