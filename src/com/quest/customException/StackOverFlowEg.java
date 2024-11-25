package com.quest.customException;

public class StackOverFlowEg {
    public static void main(String[] args) {
        try {
            causeStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e);
        }

    }
    public static void causeStackOverflow() {

        causeStackOverflow();
    }
}
