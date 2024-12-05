package com.quest.functional;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerMain {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("Bob");
        students.add("Mary");
        students.add("Paul");

        Consumer<String> printUpperCase = (name) -> {
            System.out.println(name.toUpperCase());
        };

        Consumer<String> printLength = (name) -> {
            System.out.println("Length: " + name.length());
        };

        Predicate<String> hasChar = (name) -> {
            if (name.length() > 4) {
                System.out.println(name + " has more than 4 characters? true");
                return true;
            } else {
                System.out.println(name + " has more than 4 characters? false");
                return false;
            }
        };


        students.forEach(name -> {
            printUpperCase.accept(name);
            printLength.accept(name);
            hasChar.test(name);
        });
    }
}

