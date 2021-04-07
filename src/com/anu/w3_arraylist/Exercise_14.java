package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_14 {

    public static void main(String[] args) {

        //swap two elements in an ArrayList

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Red");
        System.out.println("Elements before swap >>> \n" + colors);
        //Swapping 1st(index 0) element with the 5th(index 2) element
        Collections.swap(colors, 0, 4);
        System.out.println("Elements after swap >>> \n" + colors);
    }
}
