package com.anu.w3_arraylist;

import java.util.ArrayList;

public class Exercise_17 {

    public static void main(String[] args) {

        //Empty an array list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.removeAll(list) + "\nAfter removing Elements >>> " + list);
    }
}
