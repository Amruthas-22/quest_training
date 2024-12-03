package com.quest.queue;

import java.util.*;

public class CollectionsEg {
    public static void main(String[] args) {

Student s1 = new Student(1,"Alice");
Student s2 = new Student(2,"Bob");
Student s3 = new Student(3,"Charlie");

        Person person1 = new Person(1, "Alice", 25, "New York");
        Person person2 = new Person(2, "Bob", 30, "Los Angeles");
        Person person3 = new Person(3, "Charlie", 28, "Chicago");
        Person person4 = new Person(4, "Diana", 22, "San Francisco");

        Student1 s = new Student1("Alice", 25);
        Student1 s4 = new Student1("Bob",30);
        Student1 s5 = new Student1("Charlie", 28);


       //List
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        System.out.println("List of Persons:");
        personList.forEach(System.out::println);

        //HashSet
        HashSet<Person> personSet = new HashSet<>(personList);
        System.out.println("\nSet of Persons:");
        personSet.forEach(System.out::println);

       //HashMap
        HashMap<Integer, Person> personMap = new HashMap<>();
        for (Person person : personList) {
            personMap.put(person.getId(), person);
        }

        System.out.println("Map of Persons:");
        personMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        //queue
//        PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();
//        personPriorityQueue.add(person1);
//        personPriorityQueue.add(person2);
//        personPriorityQueue.add(person3);
//        personPriorityQueue.add(person4);


//        System.out.println("Queue of Persons:");
//        personPriorityQueue.forEach(System.out::println);

        Comparator<Student1> test = Comparator.comparing(Student1::getName);
        Comparator<Student1> test2 = (ss,ss4) -> ss.getName().compareTo(ss4.getName());
        PriorityQueue<Student1> personPriorityQueue2 = new PriorityQueue<>(test);
        personPriorityQueue2.add(s);
        personPriorityQueue2.add(s4);
        personPriorityQueue2.add(s5);

//        System.out.println("Queue of Persons:");
//        personPriorityQueue2.forEach(System.out::println);
 for(Student1 student : personPriorityQueue2) {
    System.out.println(student.getName());
}

 while(!personPriorityQueue2.isEmpty()) {
     System.out.println(personPriorityQueue2.poll());
//     System.out.println(personPriorityQueue2.peek());
 }
    }
}
