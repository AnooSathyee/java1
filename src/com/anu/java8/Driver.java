package com.anu.java8;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println("year >> " + ld.getYear());
        System.out.println("Month >> " + ld.getMonth());
        System.out.println("Month value >> " + ld.getMonthValue());
        System.out.println("day >> " + ld.getDayOfWeek());
        System.out.println("Today's day >> " + ld.getDayOfMonth());
    }
}
