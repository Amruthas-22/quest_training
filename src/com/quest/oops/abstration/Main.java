package com.quest.oops.abstration;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Buddy");
        animals[1] = new Birds("Tweety");

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
            animals[i].eat();
            animals[i].move();
            System.out.println();
        }
    }
}

