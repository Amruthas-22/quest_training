package com.quest.functional;

import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalEg {
    public static void main(String[] args) {

        Supplier<Integer> numbers = FunctionalEg::generateRandomInteger;
        Predicate<Integer> evenOrNot = FunctionalEg::isEven;
        Function<Integer, Integer> number = FunctionalEg::processNumber;
        Consumer<Integer> printResult = System.out::println;
        processAndPrint(numbers, evenOrNot, number, printResult);
    }
    public static Integer generateRandomInteger() {
        return new Random().nextInt(100) + 1;
    }
    public static boolean isEven(Integer num){
        return num %2 == 0;

    }
    public static Integer processNumber(Integer num) {
        if (isEven(num)) {
            return num * num;
        } else {
            return num * 2;
        }
    }
    public static void processAndPrint(Supplier<Integer> supplier, Predicate<Integer> predicate,
                                     Function<Integer, Integer> function, Consumer<Integer> consumer) {
        Integer randomNumber = supplier.get();
        Optional<Integer> result = Optional.of(randomNumber).filter(predicate).map(function);

        result.ifPresentOrElse(consumer, () -> System.out.println("No result"));
    }

}
