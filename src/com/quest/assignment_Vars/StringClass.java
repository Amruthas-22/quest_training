package com.quest.assignment_Vars;

public class StringClass {
    public static void main(String[] args) {
        String message = "Hello World!";
        //length
        System.out.println(message.length());
        //cases
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.charAt(0));
       //concat
        String fName = "john";
        String sName = "Doe";
        System.out.println(fName.concat(sName));

        String str = "hello, world!";
        //equal
        System.out.println( message.equals(str));
        System.out.println( message.equalsIgnoreCase(str));
        //compare
        System.out.println( message.compareTo(str));
        System.out.println(message.compareToIgnoreCase(str));
        //position and unicode
        System.out.println(str.charAt(1));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointBefore(1));
        //search
        System.out.println(str.contains("World"));
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));
        //checking start and end
        System.out.println( str.startsWith("Hello"));
        System.out.println( str.endsWith("!"));
        //substring
        System.out.println(str.substring(7));
        System.out.println(str.substring(0, 5));
        //trim
        System.out.println(str.trim());
        //format
        System.out.println(String.format("%s - %d", str, 2023));
        // Split
        String[] splitStr = str.split(", ");
        System.out.println(String.join(" | ", splitStr));

        // Length and Checking Empty
        System.out.println(str.length());
        System.out.println( str.isEmpty());




    }
}
