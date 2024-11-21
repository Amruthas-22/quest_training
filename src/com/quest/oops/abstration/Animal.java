package com.quest.oops.abstration;

public abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void  makeSound();

    void move(){
        System.out.println(name + " is running.");
    }
}
