package com.anu.masterclass.basics;

public class PositiveNegativeZero {

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("+ve");
        } else if (num < 0) {
            System.out.println("-ve");
        } else {
            System.out.println("zero");
        }
    }
}
