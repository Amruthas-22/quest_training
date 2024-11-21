package com.quest.oops.abstration;

public class LibraryMember {
    private String memberId;
    private String name;
    private String email;
    private String[] borrowedBooks;
    private int borrowedCount;


    public LibraryMember(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        borrowedBooks = new String[10];
        borrowedCount = 0;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(String ISBN) {
        if (borrowedCount < borrowedBooks.length) {
            borrowedBooks[borrowedCount++] = ISBN;
        }
    }

    public boolean hasBorrowedBook(String ISBN) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i].equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    public void returnBook(String ISBN) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i].equals(ISBN)) {
                borrowedBooks[i] = borrowedBooks[borrowedCount - 1];
                borrowedBooks[borrowedCount - 1] = null;
                borrowedCount--;
                return;
            }
        }
    }
}





