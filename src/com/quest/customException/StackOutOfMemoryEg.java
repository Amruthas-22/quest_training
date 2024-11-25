package com.quest.customException;

public class StackOutOfMemoryEg {
    public static void main(String[] args) {
        causeOutOfMemory();
    }

    public static void causeOutOfMemory() {
        try {

            while (true) {
                int[] Array = new int[Integer.MAX_VALUE];
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e);
        }
    }
}

