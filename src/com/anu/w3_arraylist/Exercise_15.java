package com.anu.w3_arraylist;

import java.util.ArrayList;

public class Exercise_15 {

    public static void main(String[] args) {
        //join two array lists
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Anu");
        list1.add("Sathiya");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Vaishu");
        list2.add("Anya");
        ArrayList<String> nest = new ArrayList<String>();
        nest.addAll(list1);
        nest.addAll(list2);
        System.out.println(nest);
    }
}
