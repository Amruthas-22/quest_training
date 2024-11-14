package com.quest.practice_Vars;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting
        int n = 5;
        double d = n;
        System.out.println(d); // Prints 5.0

        // Explicit casting
        double d2 = 9.78; // Added missing semicolon
        int n1 = (int) d2;
        System.out.println(n1); // Prints 9 (fractional part removed)

        int n3 = 200;
        byte b = (byte) n3; // Casting int to byte
        System.out.println(b); // Prints -56 due to overflow in byte range
    }
}

