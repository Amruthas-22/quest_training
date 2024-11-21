package com.quest.oops.inheritance;

public class Dog extends Animal {
     String breed;

    public Dog(String name, String species, String breed) {
        super(name, species);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog " + this.name + " barks! Woof woof!");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Breed: " + this.breed);
    }
}
