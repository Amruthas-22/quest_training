package com.quest.oops.abstration;

public class Birds extends Animal{

    Birds(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name+"Eating fruits");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet! Tweet!");

    }
}
