package com.quest.customException;

public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) throws InvalidInputException {
        if (age < 18) {
            throw new InvalidInputException("Age must be 18 or older.");
        }
        if (salary < 0) {
            throw new InvalidInputException("Salary cannot be negative.");
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public final void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}

