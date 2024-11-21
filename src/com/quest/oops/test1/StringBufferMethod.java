package com.quest.oops.test1;

public class StringBufferMethod {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Hello");
        StringBuffer sbf1 = new StringBuffer("World");
        System.out.println("Original StringBuffer: " + sbf);


        sbf.append(" World");
        System.out.println("After append: " + sbf);


        sbf.reverse();
        System.out.println("After reverse: " + sbf);

        sbf.reverse();
        sbf.replace(6, 11, "Java");
        System.out.println("After replace: " + sbf);

        sbf.delete(5, 10);
        System.out.println("After delete: " + sbf);

        sbf.insert(5, "prgm");
        System.out.println("After insert: " + sbf);

        char ch = sbf.charAt(4);
        System.out.println("Character at index 4: " + ch);


        check(sbf.toString(), sbf1.toString());
    }

    public static void check(String sbf, String sbf1) {
        System.out.println("\nEquality Check:");

        if (sbf == sbf1) {
            System.out.println("'==' comparison: true");
        } else {
            System.out.println("'==' comparison: false");
        }


        if (sbf.equals(sbf1)) {
            System.out.println("equals() comparison: true");
        } else {
            System.out.println("equals() comparison: false");
        }
    }
}
