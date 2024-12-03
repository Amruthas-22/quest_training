package com.quest.casestudyyt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTopKFrequent {
    public static void main(String[] args) {
        // Initialize a list and add
        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("apple");
        input.add("cherry");
        input.add("banana");
        input.add("banana");
//number of top frequent strings to find
        int k = 2;
// Call the method
        List<String> output = findTopKFrequent(input, k);
        System.out.println(output);
    }

    public static List<String> findTopKFrequent(List<String> strings, int k) {

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String str : strings) {
            // Use getOrDefault to avoid null values, initializing the count to 0 if the string is not in the map
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
//Convert the frequency map to a list of entries
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
//sort
        entryList.sort(new FrequencyComparator());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k && i < entryList.size(); i++) {
            result.add(entryList.get(i).getKey());
        }

        return result;
    }

}
