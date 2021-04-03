package com.anu.java8;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateFeatures {
    public static void main(String[] args) {
        // LocalDate is a predefined classes
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println("year >> " + ld.getYear());
        System.out.println("Month >> " + ld.getMonth());
        System.out.println("Month value >> " + ld.getMonthValue());
        System.out.println("day >> " + ld.getDayOfWeek());
        System.out.println("Today's day >> " + ld.getDayOfMonth());
        System.out.println("Future Day >>> " + ld.plusDays(2));
        System.out.println("Past Date >> " + ld.minusDays(1));

        // getting only time
        LocalTime lt = LocalTime.now();
        System.out.println("Current Local Time >> " + lt);
        System.out.println("Hour >>> " + lt.getHour());
        System.out.println("Minute >>> " + lt.getMinute());
        System.out.println("Second >>> " + lt.getSecond());
        System.out.println("Nano Second >>> " + lt.getNano());

    }
}
