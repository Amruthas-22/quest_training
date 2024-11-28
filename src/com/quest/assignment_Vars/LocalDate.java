package com.quest.assignment_Vars;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDate {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("current time:" +currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = currentDateTime.format(formatter);
        System.out.println(formattedDate);
      LocalDateTime someOtherDate  =  LocalDateTime.of(2023,12,11,13,15,22);
        System.out.println(someOtherDate);
      boolean After = someOtherDate.isAfter(currentDateTime);
        System.out.println(After);
        LocalDateTime plus = someOtherDate.plus(12, ChronoUnit.DAYS);
        someOtherDate = plus.minus(12, ChronoUnit.DAYS);
        System.out.println(someOtherDate);

    }
}
