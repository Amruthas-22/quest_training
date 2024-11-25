package com.quest.exception;

public class CustomExpection {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println("enter the string:" + s.length());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getLocalizedMessage());
        }
    }
}
