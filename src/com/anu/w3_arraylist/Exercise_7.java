package com.anu.w3_arraylist;

import java.util.ArrayList;

public class Exercise_7 {

    public static void main(String[] args) {

        //Write a Java program to remove the third element from a array list.

        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Grapes");
        System.out.println(list);
        System.out.println("List size before removing the element >>>> " + list.size());
        System.out.println("The removed element is >>> " + list.remove(3));
        System.out.println(list);
        System.out.println("List size after removing the element >>>> " + list.size());
    }
}
