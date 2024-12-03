package com.quest.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
//        System.out.println(a.stream().findFirst());
//        System.out.println(a.stream().distinct());//gave unique elements
        System.out.println(a.stream().findAny());//any
//        System.out.println(a.stream().max(Integer::compareTo));//max
       System.out.println(a.stream().min(Integer::compareTo).get());//min
//        Optional<Integer>  min = a.stream().min(Integer::compareTo) ;
        System.out.println(a.stream().distinct().count());
        System.out.println(a.stream().reduce(0, Integer::sum));//sum+identity

        List<Integer> b = a.stream().filter(i -> i%2 == 0).toList();// condition based op like even number find
        System.out.println(b);

        List<Integer> c = a.stream().map(i -> i*2).toList();
        int x= a.stream().map(i -> i*2).reduce(0,Integer::sum);
        System.out.println(x);
        int y= a.stream().map(i -> i*2).reduce(0,Integer::min);
        System.out.println(y);
        int z= a.stream().map(i -> i*2).max(Integer::compareTo).get();
        int q= a.stream().map(i -> i*2).min(Integer::compareTo).get();
       System.out.println("z" +z +"y" +y);


    }
}
