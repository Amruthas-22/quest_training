package com.quest.casestudy3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CustomerServiceManager {
    private Map<Customer, List<ServiceBooking>> bookingsMap = new HashMap<>();

    public void addBooking(Customer customer, ServiceBooking booking) throws InvalidBookingException {
        List<ServiceBooking> customerBookings = bookingsMap.get(customer);

        if (customerBookings != null &&
                customerBookings.stream().anyMatch(b -> b.getBookingId().equals(booking.getBookingId()))) {
            throw new InvalidBookingException("Duplicate booking ID: " + booking.getBookingId());
        }

        if (booking.getServiceDate().isBefore(LocalDateTime.now())) {
            throw new InvalidBookingException("Service date cannot be in the past.");
        }
        if (customerBookings == null) {
            customerBookings = new ArrayList<>();
            bookingsMap.put(customer, customerBookings);
        }
        customerBookings.add(booking);
    }

    public void printInvoices() {
        Consumer<Customer> printInvoice = customer -> {
            List<ServiceBooking> bookings = bookingsMap.get(customer);
            double totalCost = bookings.stream().mapToDouble(ServiceBooking::getCost).sum();
            System.out.println("Invoice for " + customer.getName() + " (" + customer.getCustomerType() + "):");
            bookings.forEach(System.out::println);
            System.out.println("Total Cost: $" + totalCost);
        };
        bookingsMap.keySet().forEach(printInvoice);
    }

    public void applyDiscountForFrequentCustomers() {
        Function<List<ServiceBooking>, Double> applyDiscount = bookings -> {
            if (bookings.size() > 3) {
                return bookings.stream().mapToDouble(b -> b.getCost() * 0.85).sum();
            }
            return bookings.stream().mapToDouble(ServiceBooking::getCost).sum();
        };

        bookingsMap.forEach((customer, bookings) -> {
            double discountedTotal = applyDiscount.apply(bookings);
            System.out.println("Total cost after discount for " + customer.getName() + ": $" + discountedTotal);
        });
    }

    public void addRandomBooking(Supplier<ServiceBooking> randomBookingSupplier) {
        ServiceBooking randomBooking = randomBookingSupplier.get();
        try {
            addBooking(randomBooking.getCustomer(), randomBooking);
            System.out.println("Random booking added: " + randomBooking);
        } catch (InvalidBookingException e) {
            System.err.println(e.getMessage());
        }
    }

    public Predicate<ServiceBooking> isWithinNext7Days() {
        return booking -> booking.getServiceDate().isBefore(LocalDateTime.now().plusDays(7))
                && booking.getServiceDate().isAfter(LocalDateTime.now());
    }

}
