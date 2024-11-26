package com.quest.customException;

public class SpecialEditionBook extends Book {
    private String specialFeature;

    public SpecialEditionBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
        this.specialFeature = "Special";
    }
    public String getSpecialFeature() {
        return specialFeature;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = "Special";
    }
    @Override
    public String toString() {
        return super.toString() + ", Special Feature: " + specialFeature;
    }
}
