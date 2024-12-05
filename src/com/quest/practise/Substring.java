package com.quest.practise;

public class Substring {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "fly"};

        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
