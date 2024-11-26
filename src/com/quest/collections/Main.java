package com.quest.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person1> list = new ArrayList<Person1>();
        list.add(new Person1(18, "Alice", "kerala", "Female"));
        list.add(new Person1(25, "Bob", "Delhi", "Male"));
        list.add(new Person1(22, "Charlie", "Chennai", "Male"));
        list.add(new Person1(19, "Diana", "Himachal", "Female"));
        list.add(new Person1(30, "Eve", "Pune", "Female"));

        System.out.println("People with age below 20 (Using for loop):");
        for (Person1 person : list) {
            if (person.getAge() < 20) {
                System.out.println(person.getName() + " : " + person.getAge());
            }
        }
        System.out.println("\nPeople with age 20 and above (Using Iterator):");
        Iterator<Person1> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person1 person = iterator.next();
            if (person.getAge() > 20) {
                System.out.println(person.getName() + " : " + person.getAge());
            }
        }
        System.out.println(list.size());
        System.out.println(list.contains(new Person1(18, "Alice", "kerala", "Female")));
        System.out.println(list.isEmpty());

    }
}
