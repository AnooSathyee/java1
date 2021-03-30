package com.anu.w3_arraylist;

import java.util.ArrayList;

public class Exercise_5 {

    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("orange");
        colorList.add("pink");
        colorList.add("white");
        colorList.add("yellow");
        colorList.add("purple");
        System.out.println(colorList);
        System.out.println(colorList.size());
        colorList.set(2, "grey");
        System.out.println(colorList);
        System.out.println(colorList.size());
    }
}
