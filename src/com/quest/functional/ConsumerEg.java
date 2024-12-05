package com.quest.functional;

import java.util.function.Consumer;

public class ConsumerEg {
    public static void main(String[] args) {
        Consumer<String> con = (s1) -> {
            // it will process but not return
            System.out.println(s1);
        };
        con.accept("Hello");
        con.accept("World");
    }
}
