package com.quest.queue;

public class Student1 {
    private String name;
    private int mark;
    public Student1(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public String toString() {
        return "Student1 [name=" + name + ", mark=" + mark + "]";
    }
}
