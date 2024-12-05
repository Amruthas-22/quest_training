package com.quest.practise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatClass {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("current time:" +currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        String formattedDate = currentDateTime.format(formatter);
        System.out.println(formattedDate);
    }
}
