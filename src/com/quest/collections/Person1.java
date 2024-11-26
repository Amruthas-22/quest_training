package com.quest.collections;

public class Person1 {
    private int age;
    private String name;
    private String location;
    private String gender;


    public Person1(int age, String name, String location, String gender) {
        this.age = age;
        this.name = name;
        this.location = location;
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getGender() {
        return gender;
    }
}
