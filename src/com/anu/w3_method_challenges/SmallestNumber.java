package com.anu.w3_method_challenges;

import java.util.Scanner;

public class SmallestNumber {

    public static double smallestNumber(double x, double y, double z){
        return Math.min(Math.min(x , y),z);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input First Number >>> ");
        double x = input.nextDouble();
        System.out.println("Input Second Number >>> ");
        double y = input.nextDouble();
        System.out.println("Input Third Number >>> ");
        double z = input.nextDouble();
        System.out.println(smallestNumber(x,y,z));

    }
}
