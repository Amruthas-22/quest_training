package com.quest.oops.inheritance;

public class Animal {
    String name;
    String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public void displayInfo() {
        String msg = String.format("Animal Name: %s, Species: %s", name, species);
        System.out.println(this.name);
        System.out.println(msg);
    }

}
