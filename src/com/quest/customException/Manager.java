package com.quest.customException;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, double salary, int teamSize) throws InvalidInputException {
        super(name, age, salary);
        if (teamSize < 1) {
            throw new IllegalArgumentException("Team size must be greater than zero.");
        }
        this.teamSize = teamSize;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Team Size: " + teamSize;
    }
}
