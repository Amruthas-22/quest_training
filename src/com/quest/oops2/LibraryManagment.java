package com.quest.oops2;

public class LibraryManagment {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456");
        Book book2 = new Book("1984", "George Orwell", "654321");

        Member member1 = new Member("Alice", 1, "Regular");
        PremiumMember member2 = new PremiumMember("Bob", 2);

        System.out.println(book1);
        System.out.println(book2);

        member1.borrowBook(book1);
        member1.borrowBook(book2);
        member2.borrowBook(book1);
        member2.borrowBook(book2);

        member1.returnBook(book1);
        member1.returnBook(book2);
        member2.returnBook(book1);

        System.out.println("Member 1: " + member1.getName() + ", " + member1.getMembershipType());
        System.out.println("Member 2: " + member2.getName() + ", " + member2.getMembershipType());

        member1.calculateLateFees(5);
        member2.calculateLateFees(3);
    }
}
