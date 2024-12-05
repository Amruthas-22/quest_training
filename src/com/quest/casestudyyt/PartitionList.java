package com.quest.casestudyyt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionList {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        int n = 2;
        List<List<Integer>> output = partitionList(input, n);
        System.out.println(output);
    }
    public static List<List<Integer>> partitionList(List<Integer> input, int n) {
        List<List<Integer>> output = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int size = input.size();

        int i = 0;
        while (i < size) {
            List<Integer> sublist = new ArrayList<>();

            for (int j = 0; j < n && i < size; j++) {
                sublist.add(input.get(i++));
            }
            result.add(sublist);
        }
        return result;
    }
    }

