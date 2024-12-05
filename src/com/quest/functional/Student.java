package com.quest.functional;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printUpperCase(String name) {
        System.out.println(name.toUpperCase());
    }
    public static void printLength(String name) {
        System.out.println("Length: " + name.length());
    }
}


