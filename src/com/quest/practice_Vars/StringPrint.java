package com.quest.practice_Vars;

public class StringPrint {
    public static void main(String[] args) {
        String s = "AMRUTHA";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (s.indexOf(c) == j) {
                int count = 0;
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == c) {
                        count++;
                    }
                }
                System.out.println(c + " - " + count);
            }
        }
    }
}



