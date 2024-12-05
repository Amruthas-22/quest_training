package com.quest.serilazable;

import java.io.Serializable;

public class Employee implements Serializable {
    private final long serilazableId = 1202L;
    private String firstName;
    private int id;
    private int age;

    public Employee(String firstName) {
        this.firstName = firstName;
    }
}
