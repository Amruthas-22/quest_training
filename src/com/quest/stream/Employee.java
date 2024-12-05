package com.quest.stream;

public class Employee {

        private int id;
        private String name;
        private int age;
        private String department;
        private double salary;
        private int yearsOfExperience;

        public Employee(int id, String name, int age, String department, double salary, int yearsOfExperience) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
            this.yearsOfExperience = yearsOfExperience;
        }


        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getDepartment() {
            return department;
        }
        public double getSalary() {
            return salary;
        }
        public int getYearsOfExperience() {
            return yearsOfExperience;
        }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', age=%d, department='%s', salary=%.2f, experience=%d}",
                id, name, age, department, salary, yearsOfExperience);
    }
}