package com.quest.oops.abstration;

public class RegularStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Attend online and offline classes");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Submit assignment");

    }
}
