package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_9 {

    public static void main(String[] args) {

        //Copy one ArrayList to another
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five");
        System.out.println("List1: " + list1);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Six");
        list2.add("Seven");
        list2.add("Eight");
        list2.add("Nine");
        list2.add("Ten");
        System.out.println("List2: " + list2);
        Collections.copy(list2, list1);
        System.out.println("After copying >>>> ");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
    }
}
