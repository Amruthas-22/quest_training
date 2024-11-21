package com.quest.oops.abstration;

public class NonFictionBook extends Book {
    String subject;

    public NonFictionBook(String ISBN, String title, String author, int publicationYear, String subject) {
        super(ISBN, title, author, publicationYear);
        this.subject = subject;
    }

    @Override
    public void printBookDetails() {
        System.out.println("Non-Fiction Book:");
        System.out.println("Title: " + title); // Direct field access
        System.out.println("Author: " + author); // Direct field access
        System.out.println("Subject: " + subject);
        System.out.println("Publication Year: " + publicationYear); // Direct field access
        System.out.println("ISBN: " + ISBN); // Direct field access
        System.out.println("Availability: " + (availability ? "Available" : "Not Available")); // Direct field access
    }
}
