package com.quest.oops.interfaces;

public class Bmw extends Car2 implements Car{
    @Override
    public void wheel() {
        System.out.println("BMW wheels are smooth.");
    }

    @Override
    public void engine() {
        System.out.println("BMW engines are powerful.");

    }

    @Override
    void horn() {

    }

    @Override
    void light() {

    }
}
