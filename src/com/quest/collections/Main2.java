package com.quest.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Person2> list = new LinkedList<>();
        list.add(new Person2(18, "Alice", "New York", "Female"));
        list.add(new Person2(25, "Bob", "Los Angeles", "Male"));
        list.add(new Person2(22, "Charlie", "Chicago", "Male"));
        list.add(new Person2(19, "Diana", "Houston", "Female"));
        list.add(new Person2(30, "Eve", "Phoenix", "Female"));

        System.out.println("Initial List:");
        for (Person2 person : list) {
            System.out.println(person.getName() + " : " + person.getAge()+ " :" + person.getGender()+":"+person.getLocation());
        }
        System.out.println("\nAccessed Elements:");
        System.out.println("First Element: " + list.getFirst().getName() + " : " + list.getFirst().getAge());
        System.out.println("Last Element: " + list.getLast().getName() + " : " + list.getLast().getAge());
        System.out.println("Element at index 1: " + list.get(1).getName() + " : " + list.get(1).getAge());

        System.out.println("\nRemoved Elements:");
        if (!list.isEmpty()) {
            System.out.println("Removed First Element: " + list.removeFirst().getName() + " : " + list.removeFirst().getAge());
        }
        if (!list.isEmpty()) {
            System.out.println("Removed Last Element: " + list.removeLast().getName() + " : " + list.removeLast().getAge());
        }
        if (list.size() > 1) {
            System.out.println("Removed Element at index 1: " + list.remove(2).getName() + " : " + list.remove(1).getAge());
        } else {
            System.out.println("Cannot remove element at index 1: List size is " + list.size());
        }

        System.out.println("Is the new list empty? " + list.isEmpty());
        System.out.println("\nList Size: " + list.size());
        System.out.println("Contains 'Alice': " + list.contains(new Person2(18, "Alice", "New York", "Female")));

        list.addFirst(new Person2(22, "E", "Boston", "Male"));
        list.addLast(new Person2(30, "G", "San Francisco", "Male"));
        list.add(1, new Person2(25, "F", "Seattle", "Female"));

        System.out.println("\nPersons with Age > 20 (Using for-each):");
        for (Person2 person : list) {
            if (person.getAge() > 20) {
                System.out.println(person.getName() + " : " + person.getAge()+ " :" + person.getGender()+":"+person.getLocation());
            }
        }

        System.out.println("\nPersons with Age <= 20 (Using Iterator):");
        Iterator<Person2> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person2 person = iterator.next();
            if (person.getAge() <= 20) {
                System.out.println(person.getName() + " : " + person.getAge()+ " :" + person.getGender()+":"+person.getLocation());
            }
        }
    }
}
