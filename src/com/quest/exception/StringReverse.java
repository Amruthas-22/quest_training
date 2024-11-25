package com.quest.exception;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedStr = "";
        str = str + "$";

        for (int i = str.length()-1; i>=0; i--) {
            reversedStr += str.charAt(i);

        }
        System.out.println(reversedStr);
       // System.out.println(str);


    }
}
