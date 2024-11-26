package com.quest.collections;
import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args) {
       LinkedList<String>list = new LinkedList<>();
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");
       list.addFirst("E");
       list.addLast("G");
       list.add(2, "F");
//       System.out.println(list.getFirst());
//       System.out.println(list.getLast());
//       System.out.println(list.get(1));
//       System.out.println(list.removeFirst());
//       System.out.println(list.removeLast());
//        System.out.println(list.remove(1));
//        System.out.println(list.remove());
//        list.clear();
        System.out.println(list.size());
        System.out.println(list.contains("A"));
        System.out.println(list.remove(1));

       for(String l : list){
          System.out.println(list);
       }
       LinkedList<Person1> list2 = new LinkedList<>();
//        System.out.println(list2.isEmpty());
//        Person1 person = new Person1();
//        list2.remove();

    }
}
