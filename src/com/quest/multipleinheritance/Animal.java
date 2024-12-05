package com.quest.multipleinheritance;

public class Animal implements Cat,Dog {
    @Override
    public void eat() {
        System.out.println(" eats non veg");
    }

    @Override
    public void sleep() {
        Cat.super.sleep();
    }

}
