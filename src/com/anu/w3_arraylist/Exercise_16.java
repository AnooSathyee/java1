package com.anu.w3_arraylist;

import java.util.ArrayList;

public class Exercise_16 {

    public static void main(String[] args) {

        //clone an arrayList to another ArrayList
        ArrayList<Integer> listOriginal = new ArrayList<Integer>();
        listOriginal.add(10);
        listOriginal.add(20);
        listOriginal.add(30);
        System.out.println("listOriginal >>> " + listOriginal);
        Object obj = listOriginal.clone();
        System.out.println("Cloned Object >>> " + obj);

    }
}
