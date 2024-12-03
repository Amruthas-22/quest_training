package com.quest.collectionpractice;

import java.util.HashMap;
import java.util.Scanner;

public class MapEmployeeSearch {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "John Doe");
        employees.put(102, "Jane Smith");
        employees.put(103, "Mark Johnson");
        employees.put(104, "Emily Davis");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to search: ");

        int employeeId = sc.nextInt();

        String employeeName = employees.get(employeeId);

        if (employeeName != null) {
            System.out.println("Employee ID " + employeeId + " is " + employeeName);
        } else {
            System.out.println("Employee not found for ID: " + employeeId);
        }

        sc.close();
    }
}
