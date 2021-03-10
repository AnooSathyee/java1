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
        if(hungerRating > 5){
            System.out.println("Not Hungry");
        } else {
            System.out.println("I'm starving");
        }
    }
}
