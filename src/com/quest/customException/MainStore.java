package com.quest.customException;

public class MainStore {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Book A", "Author A", 25.99, 10),
                new Book("Book B", "Author B", 15.49, 5),
                new SpecialEditionBook("Book C", "Author C", 35.99, 3),
                new Book("Book D", "Author D", 20.99, 7),
                new SpecialEditionBook("Book E", "Author E", 50.00, 2)
        };
        double priceThreshold = 20.0;
        System.out.println("\nBooks priced above $" + priceThreshold + ":");

        BookFilter filter = (Book book) ->
            book.getPrice() > priceThreshold;

        for (int i = 0; i < books.length; i++) {
            if (filter.filter(books[i])) {
                System.out.println(books[i].getTitle());
            }
        }

        try {
            books[0].purchase(6);
            books[2].purchase(4);
        } catch (OutOfStockException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\nApplying Discount of " + Book.DISCOUNT_PERCENTAGE + "%:");
        for (int i = 0; i < books.length; i++) {
            double discountedPrice = books[i].getPrice() * (1 - Book.DISCOUNT_PERCENTAGE / 100);
            System.out.printf("Discounted price of \"%s\": $%.2f%n", books[i].getTitle(), discountedPrice);
        }

    }
}