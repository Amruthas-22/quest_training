package com.quest.queue;

public class Student implements Comparable<Student> {
    private int id;
    private String Name;

    public Student(int id,String Name) {
        this.id = id;
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
       this. Name = name;
    }
@Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
