package com.quest.customException;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    public static final double DISCOUNT_PERCENTAGE = 10.0;
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void purchase(int quantity) throws OutOfStockException {
        if (stock < quantity) {
            throw new OutOfStockException("Not enough stock for " + title + "\". Available: " + stock);
        }
        stock -= quantity;
        System.out.println("Purchased " + quantity + " copies of \"" + title + "\".");
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Stock: " + stock;
    }
}
