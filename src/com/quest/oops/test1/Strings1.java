package com.quest.oops.test1;

public class Strings1 {


    public static void check(StringBuilder s1, StringBuilder s2){
        if(s1 == s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(s1.equals(s2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder();

        s2.append("world" );
        System.out.println(s2.charAt(2));
        //check(s1,s2);
        String s3 = "hello";
        String s4 = "world";
        String s5 = s3 + s4;
        //System.out.println(s5);
    }
}
