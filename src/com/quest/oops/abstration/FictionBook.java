package com.quest.oops.abstration;

public class FictionBook extends Book {
    String genre;

    public FictionBook(String ISBN, String title, String author, int publicationYear, String genre) {
        super(ISBN, title, author, publicationYear);
        this.genre = genre;
    }

    @Override
    public void printBookDetails() {
        System.out.println("Fiction Book:");
        System.out.println("Title: " + title); // Direct access
        System.out.println("Author: " + author); // Direct access
        System.out.println("Genre: " + genre);
        System.out.println("Publication Year: " + publicationYear); // Direct access
        System.out.println("ISBN: " + ISBN); // Direct access
        System.out.println("Availability: " + (availability ? "Available" : "Not Available")); // Direct access
    }
}
