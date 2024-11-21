package com.quest.oops.abstration;

public interface LibraryOperations {


        void addBook(Book book);
        Book searchBook(String query);
        void borrowBook(String ISBN, String memberId);
        void returnBook(String ISBN, String memberId);
        void displayAvailableBooks();
        void displayAllMembers();
    }



