package com.quest.casestudyyt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GrpByFrequency {
    public static void main(String[] args) {
        // Initialize a list and add
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(2);
        input.add(3);
        input.add(3);
        input.add(3);
        // Call the method
        Map<Integer, List<Integer>> output = groupByFrequency(input);
        System.out.println(output);
    }
    public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> input) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : input) {
            // check num,increment current frequency,if not initilze to 1
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        Map<Integer, List<Integer>> result = new HashMap<>();
        //iterate over each key-value pair in the map,
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) { //iterate over each key-value pair in the map,
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (!result.containsKey(frequency)) {
                result.put(frequency, new ArrayList<>());
            }
            result.get(frequency).add(number);
        }
        return result;
    }

}
