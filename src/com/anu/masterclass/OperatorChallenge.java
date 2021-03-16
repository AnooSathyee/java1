package com.anu.masterclass;

public class OperatorChallenge {

    public static void main(String[] args) {

        double d = 20.00;
        double d2 = 80.00;
        double result = (d + d2) * 100;
        System.out.println(result);
        double r = result % 40.00;
        System.out.println(r);
        boolean b = true;
        if(r == 0){
            System.out.println(b);
        } else{
            System.out.println(b = false);
        }



    }
}
