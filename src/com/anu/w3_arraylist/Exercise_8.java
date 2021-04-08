package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_8 {

    public static void main(String[] args) {

        // Sort the ArrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Grapes");
        list.forEach(System.out::println);
//        System.out.println("List before sorting >>> ");
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println("List after sorting >>> ");
//        System.out.println(list);
    }
}
