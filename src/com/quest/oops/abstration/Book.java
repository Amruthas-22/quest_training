package com.quest.oops.abstration;

abstract class Book {
    String ISBN;
    String title;
    String author;
    int publicationYear;
    boolean availability;

    public Book(String ISBN, String title, String author, int publicationYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.availability = true;
    }

    // Abstract method to be implemented by subclasses
    public abstract void printBookDetails();

    // Directly check availability without a getter
    public boolean isAvailable() {
        return availability;
    }
}
