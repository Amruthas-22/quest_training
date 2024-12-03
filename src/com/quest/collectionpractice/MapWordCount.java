package com.quest.collectionpractice;

import java.util.HashMap;
import java.util.Map;

public class MapWordCount {
    public static void main(String[] args) {
        String sentence = "Java is fun and java is powerful";


        Map<String, Integer> wordCount = countWordFrequency(sentence);

        System.out.println("Word Frequency:");
        wordCount.forEach((word, count) -> {
            System.out.println(word + " -> " + count);
        });
    }
    public static Map<String, Integer> countWordFrequency(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
