package com.quest.oops.abstration;

import java.util.Scanner;

public class LibraryManagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        // Adding some initial books
        FictionBook fictionBook = new FictionBook("12345", "Rom Com", "John Doe", 2020, "Comedy");
        NonFictionBook nonFictionBook = new NonFictionBook("67890", "Python Essentials", "Jane Smith", 2021, "Technology");
        library.addBook(fictionBook);
        library.addBook(nonFictionBook);


        LibraryMember member1 = new LibraryMember("M001", "Alice", "alice@mail.com");
        LibraryMember member2 = new LibraryMember("M002", "Bob", "bob@mail.com");
        library.addMember(member1);
        library.addMember(member2);



        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Members");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter book type (fiction/non-fiction): ");
                    String bookType = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    if (bookType.equalsIgnoreCase("fiction")) {
                        System.out.print("Enter genre: ");
                        String genre = scanner.nextLine();
                        library.addBook(new FictionBook(ISBN, title, author, year, genre));
                    } else if (bookType.equalsIgnoreCase("non-fiction")) {
                        System.out.print("Enter subject: ");
                        String subject = scanner.nextLine();
                        library.addBook(new NonFictionBook(ISBN, title, author, year, subject));
                    } else {
                        System.out.println("Invalid book type.");
                    }
                    break;

                case 2:

                    System.out.print("Enter search query (title/author/ISBN): ");
                    String query = scanner.nextLine();
                    Book searchedBook = library.searchBook(query);
                    if (searchedBook != null) {
                        searchedBook.printBookDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:

                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter ISBN of book to borrow: ");
                    String borrowISBN = scanner.nextLine();
                    library.borrowBook(borrowISBN, memberId);
                    break;

                case 4:

                    System.out.print("Enter member ID: ");
                    String returnMemberId = scanner.nextLine();
                    System.out.print("Enter ISBN of book to return: ");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnISBN, returnMemberId);
                    break;
                case 5:

                    library.displayAllMembers();
                    break;

                case 6:

                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
