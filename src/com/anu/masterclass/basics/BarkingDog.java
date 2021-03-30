package com.anu.masterclass.basics;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        /* barking = false; */
        if (hourOfDay < 8 && hourOfDay >= 22) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false,
                1));
    }
}



