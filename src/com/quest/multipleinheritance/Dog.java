package com.quest.multipleinheritance;

public interface Dog {
    void eat();
    default void sleep() {
        System.out.println("sleep for 8hrs");
    }
    static void run() {
        System.out.println("sleep");
    }
}
