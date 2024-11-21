package com.quest.oops.inheritance;

public class Person {
     String name;
     int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void nameDisplay() {
        String msg = String.format("STUDENT NAME IS %s & AGE IS %d", name,age);
        System.out.println(this.name);
        System.out.println(msg);
    }
}
