package com.quest.practise;

public class StringImmutable {
    public static void main(String[] args) {

        String str = "Hello";

        String modifiedStr = str.concat(" World");

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedStr);

        System.out.println("str == modifiedStr: " + (str == modifiedStr));
    }
}
