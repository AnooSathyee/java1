package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercise_12 {

    public static void main(String[] args) {

        //extract a portion of ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        List subString = list.subList(0,3);
        System.out.println(subString);
    }
}
