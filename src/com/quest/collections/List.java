package com.quest.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Person>list = new ArrayList<Person>();
//        ArrayList<Person>list2 = new ArrayList<Person>();
//        list2.addAll(list);

//       Person person = new Person();
//       person.setAge(12);
//       person.setAge(20);
//       person.setAge(30);
//       person.setName("JOHN");
//       person.setName("Jane");
//       person.setName("Jack");
       list.add(new Person("john",19));
       list.add(new Person("jane",22));
       list.add(new Person("mary",23));
//       int a = list.get(1).getAge();
        String a = list.get(1).getName();
        System.out.println(a);
//        list.clear();
//        list.remove(1);
       list.get(1);

//      ArrayList<Integer> list1 = new ArrayList<Integer>();
//      list1.add(1);

        for (Person p : list) {
//            System.out.println(p.getName() + " : " + p.getAge());
        }
        for (Person p : list) {
            if(p.getAge() > 20){
//            System.out.println(p.getName() + " : " + p.getAge());
            }
        }
        Iterator<Person> iterator = list.iterator();
            while(iterator.hasNext()) {
                Person p = iterator.next();//object
                if (p.getAge() < 20) {
                    System.out.println(p.getName());
                    System.out.println(p.getAge());
                }
            }
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            for (int i : list1) {
//                System.out.println(i);
            }

    }

}
