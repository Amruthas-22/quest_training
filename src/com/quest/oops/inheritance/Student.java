package com.quest.oops.inheritance;

public class Student extends Person {
    private String schoolName;
    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;

    }
    public void study() {
        System.out.println("Student study :"+this.name);
    }
    public void nameDisplay() {
        super.nameDisplay();
        System.out.println("I study in :"+this.schoolName);
    }
}
