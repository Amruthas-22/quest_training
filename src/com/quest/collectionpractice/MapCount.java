package com.quest.collectionpractice;

import java.util.HashMap;
import java.util.Map;

public class MapCount {
    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> characterCount = countCharacterOccurrences(input);
        characterCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
    public static Map<Character, Integer> countCharacterOccurrences(String input) {
        Map<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (characterCount.containsKey(c)) {
                characterCount.put(c, characterCount.get(c) + 1);
            }else {
                characterCount.put(c, 1);
            }
        }
        return characterCount ;
    }
}
