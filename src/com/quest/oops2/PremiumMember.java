package com.quest.oops2;

class PremiumMember extends Member {
    int borrow_limit;

    public PremiumMember(String name, int id) {
        super(name, id, "Premium");
        this.borrow_limit = 5;

    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedCount < borrowLimit) {
            borrowedCount++;
            System.out.println(getName() + " (Premium Member) borrowed: " + book.getTitle());
        } else {
            System.out.println(getName() + " (Premium Member) has reached the borrowing limit of " + borrowLimit + " books.");
        }
    }

    @Override
    public String toString() {
        return "Premium " + super.toString();
    }
}
