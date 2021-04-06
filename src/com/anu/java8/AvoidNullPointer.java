package com.anu.java8;

import java.util.Optional;

public class AvoidNullPointer {

    public static void main(String[] args) {
        String s = null;
//        if (s != null) {
//            System.out.println(s.length());
   // }
            // Build Optional class object
            Optional<String> op = Optional.ofNullable(s);

            if(op.isPresent()){
                System.out.println(op.get());
            } else{
                System.out.println("Please pass the data to the variable");
            }
        }
    }


