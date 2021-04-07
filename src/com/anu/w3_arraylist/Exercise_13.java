package com.anu.w3_arraylist;

import java.util.ArrayList;

public class Exercise_13 {

    public static void main(String[] args) {

        //compare two arrayLists
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("White");
        list1.add("Yellow");
        list1.add("Blue");
        list1.add("Pink");
        list1.add("Maroon");
        System.out.println("List1 >>> \n" + list1);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("White");
        list2.add("Yellow");
        list2.add("Blue");
        list2.add("Pink");
        list2.add("Black");
        list2.add("Maroon");
        System.out.println("List2 >>> \n" + list2);

        boolean b = list1.equals(list2);
        System.out.println(b);

        ArrayList<String> list3 = new ArrayList<String>();
        for (String temp : list1)
            list3.add(list2.contains(temp) ? "Yes" : "No");
        System.out.println(list3);

    }
}
