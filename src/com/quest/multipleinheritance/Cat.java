package com.quest.multipleinheritance;

public interface Cat {
    void eat();
    default void sleep() {
        System.out.println("sleep for 8 hrs");
    }
    static void run() {
        System.out.println("run");
    }
}
