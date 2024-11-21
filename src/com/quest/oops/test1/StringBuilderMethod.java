package com.quest.oops.test1;

public class StringBuilderMethod {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb1 = new StringBuilder("World");
        System.out.println("Original StringBuilder: " + sb);

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.reverse();
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);


        sb.delete(5, 10);
        System.out.println("After delete: " + sb);


        sb.insert(5, "prgm");
        System.out.println("After insert: " + sb);

        char ch = sb.charAt(4);
        System.out.println("Character at index 7: " + ch);

        check(sb.toString(),sb1.toString());

    }
    public static void check(String sb, String sb1){
        System.out.println("\nEquality Check:");

        if(sb == sb1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(sb.equals(sb1)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
