package com.quest.collections;

public class Person2 {
    private int age;
    private String name;
    private String location;
    private String gender;

    public Person2(int age, String name, String location, String gender) {
        this.age = age;
        this.name = name;
        this.location = location;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
