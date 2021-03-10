package com.anu;

public class ControlFlow {

    public static void main(String[] args) {

        boolean hungry = true;

        if (hungry) {
            System.out.println("I'm starving");
        } else {
            System.out.println("I'm not hungry");
        }
        int hungerRating = 7;
        if (hungerRating > 5) {
            System.out.println("Not Hungry");
        } else {
            System.out.println("I'm starving");
        }

        // switch-case statements
        int monthN = 6;
        String month = null;
        switch (monthN) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            default:
                month = "unknown Month";
                break;
        }
        System.out.println(month);

    }
}
