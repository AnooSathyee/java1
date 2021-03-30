package com.anu.w3_method_challenges;

import java.util.Scanner;

public class Average {

    public static double average(double x, double y, double z){
        double avg = (x + y + z)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input First Number >>> ");
        double x = input.nextDouble();
        System.out.println("Input Second Number >>> ");
        double y = input.nextDouble();
        System.out.println("Input Third Number >>> ");
        double z = input.nextDouble();
        System.out.println(average(x,y,z));

    }
}
