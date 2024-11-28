package com.quest.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<String> linked = new LinkedHashSet<String>();
        linked.add("Abbu");
        linked.add("Boy");
        linked.add("Cat");
        linked.add("Dog");
        for (String s : linked) {
            System.out.println(s);
        }
        System.out.println(linked.size());
        System.out.println(linked.contains("Dog"));
        System.out.println(linked.remove("Cat"));
        System.out.println(linked.isEmpty());
        linked.clear();
        Iterator<String> iterator = linked.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
