package com.quest.oops.abstration;

public class Library {
    private Book[] books;
    private LibraryMember[] members;
    private int bookCount;
    private int memberCount;

    public Library() {
        books = new Book[10]; // Fixed-size array for books
        members = new LibraryMember[10]; // Fixed-size array for members
        bookCount = 0;
        memberCount = 0;
    }


    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Invalid book. Cannot be added.");
            return;
        }
        if (bookCount >= books.length) {
            System.out.println("Cannot add more books. Library book limit reached.");
            return;
        }
        books[bookCount++] = book;
        System.out.println("Book added successfully: " + book.title);
    }


    public Book searchBook(String query) {
        if (query == null || query.isEmpty()) {
            System.out.println("Invalid query.");
            return null;
        }
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.title.equalsIgnoreCase(query) ||
                    book.author.equalsIgnoreCase(query) ||
                    book.ISBN.equals(query)) {
                return book;
            }
        }
        System.out.println("No book found matching the query: " + query);
        return null;
    }


    public void borrowBook(String ISBN, String memberId) {
        Book book = searchBook(ISBN);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        LibraryMember member = findMemberById(memberId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        book.availability = false;
        member.borrowBook(ISBN);
        System.out.println("Book borrowed successfully by " + member.getName());
    }


    public void returnBook(String ISBN, String memberId) {
        Book book = searchBook(ISBN);
        if (book == null || book.isAvailable()) {
            System.out.println("Invalid return attempt.");
            return;
        }

        LibraryMember member = findMemberById(memberId);
        if (member == null || !member.hasBorrowedBook(ISBN)) {
            System.out.println("Invalid return attempt.");
            return;
        }

        book.availability = true;
        member.returnBook(ISBN);
        System.out.println("Book returned successfully by " + member.getName());
    }


    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printBookDetails();
            }
        }
    }


    public void displayAllMembers() {
        System.out.println("Library Members:");
        for (int i = 0; i < memberCount; i++) {
            System.out.println("Member ID: " + members[i].getMemberId() + ", Name: " + members[i].getName());
        }
    }


    public void addMember(LibraryMember member) {
        if (member == null) {
            System.out.println("Invalid member. Cannot be added.");
            return;
        }
        if (memberCount >= members.length) {
            System.out.println("Cannot add more members. Member limit reached.");
            return;
        }
        members[memberCount++] = member;
        System.out.println("Member added successfully: " + member.getName());
    }


    private LibraryMember findMemberById(String memberId) {
        if (memberId == null || memberId.isEmpty()) {
            return null;
        }
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId().equals(memberId)) {
                return members[i];
            }
        }
        return null;
    }
}
