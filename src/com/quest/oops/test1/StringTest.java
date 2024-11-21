package com.quest.oops.test1;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        check(str1, str2);
    }
    public static void check(String str1, String str2) {
        System.out.println("\nEquality Check:");

        if(str1 == str2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(str1.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
