package com.quest.optionalclass;

import java.util.List;
import java.util.Optional;

public class OptionalEg {
    public static void main(String[] args) {
        List<String> names = List.of("James","janu","ammu","stefy");
        Optional<String> output = names.stream().filter((name) -> name.equalsIgnoreCase("james")).findFirst();

        // creating an optional value with non null

    }
}
