package com.quest.multipleinheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog.run();
    }
}
