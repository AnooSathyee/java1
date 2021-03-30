package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercise_3 {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<String>();
        colours.add("Violet");
        colours.add("Indigo");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");
        System.out.println(colours);
        colours.add(0,"Pink");
        System.out.println(colours);
    }
}
