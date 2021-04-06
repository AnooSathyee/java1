package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_11 {

    public static void main(String[] args) {

        //reverse elements in an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("After reversing elements >>> \n" + list);
    }
}
