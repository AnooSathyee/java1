package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercise_6 {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("index 1");
        l1.add("index-2");
        l1.add("index-3");
        l1.add("index-4");
        String element = "index-8";
        if (l1.contains(element)) {
            System.out.println("Elements found!!!");
        } else {
            System.out.println("Elements doesn't exist");
        }
    }
}
