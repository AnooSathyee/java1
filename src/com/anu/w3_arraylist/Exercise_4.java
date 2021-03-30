package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercise_4 {

    public static void main(String[] args) {
        List<String> color = new ArrayList<String>();
        color.add("Pink");
        color.add("yellow");
        color.add("red");
        color.add("white");
        //print the list
        System.out.println(color);
        //retrieve the first element
        System.out.println(color.get(0));
        //retrieve the 3rd element
        System.out.println(color.get(2));
    }
}
