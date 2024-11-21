package com.quest.oops2;

public class Member implements LibraryOperation {
     String name;
     int id;
     String membershipType;
     final int borrowLimit = 3;
     int borrowedCount = 0;

    public Member(String name, int id, String membershipType) {
        this.name = name;
        this.id = id;
        this.membershipType = membershipType;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membershipType;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook(Book book) {
        if (book == null) {
            System.out.println("Invalid book.");
            return;
        }

        if (borrowedCount < borrowLimit) {
            borrowedCount++;
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println(name + " has reached the borrowing limit of " + borrowLimit + " books.");
        }
    }


    @Override
    public void returnBook(Book book) {
        if (book == null) {
            System.out.println("Invalid book.");
            return;
        }

        if (borrowedCount > 0) {
            borrowedCount--;
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println("No books to return.");
        }
    }


    public void calculateLateFees(final int daysLate) {
        int feePerDay = 2;
        System.out.println(name + " has a late fee of Rs" + (feePerDay * daysLate));
    }

    @Override
    public String toString() {
        return "Member [Name: " + name + ", ID: " + id + ", Membership: " + membershipType + "]";
    }
}