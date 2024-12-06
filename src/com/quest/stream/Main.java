package com.quest.stream;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"arun",20,"IT",20000,1);
        Employee employee2 = new Employee(2,"sam",21,"HR",25000,2);
        Employee employee3 = new Employee(3,"joe",22,"IT",30000,3);
        Employee employee4 = new Employee(4,"anna",23,"HR",35000,4);

        List<Employee> employeeList = List.of(employee1,employee2,employee3,employee4);

        List<Employee> sortedBySalaryDesc = employeeList.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .toList();

        System.out.println("------------");
        List<Employee> salary = employeeList.stream().filter(e -> e.getSalary() > 25000) .toList();
       salary.forEach(System.out::println);

        System.out.println("---------");

        Optional<Employee> maxEmp = employeeList.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .findFirst();
        System.out.println(maxEmp.get());

        System.out.println("--------");
        List<Employee> skipEmp = employeeList.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).skip(3)
                .toList();

        System.out.println("-------");

      Optional<Double> totalSaalary =   employeeList.stream().map(Employee::getSalary).reduce((s1, s2) -> s1 + s2);
        System.out.println( totalSaalary.get() );

        System.out.println("---------");


    }
}
