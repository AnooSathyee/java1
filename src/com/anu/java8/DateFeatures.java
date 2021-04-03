package com.anu.java8;

import java.time.LocalDate;

public class DateFeatures {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println("year >> " + ld.getYear());
        System.out.println("Month >> " + ld.getMonth());
        System.out.println("Month value >> " + ld.getMonthValue());
        System.out.println("day >> " + ld.getDayOfWeek());
        System.out.println("Today's day >> " + ld.getDayOfMonth());
        System.out.println("Future Day >>> " + ld.plusDays(2));
        System.out.println("Past Date >> " + ld.minusDays(1));
    }
}
