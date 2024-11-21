package com.quest.oops.abstration;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(name+"Eating meat");

    }

    @Override
    public void makeSound() {
        System.out.println(name + " bow: bow! bow!");

    }
}
