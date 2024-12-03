package com.quest.collectionpractice;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCount {
    public static void main(String[] args) {

                String input = "Java is fun and java is powerful";

                String[] words = input.toLowerCase().split("\\s+");

                Map<String, Integer> wordCount = new HashMap<>();

                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }

                wordCount.forEach((key, value) -> System.out.println(key + " -> " + value));
            }
        }




