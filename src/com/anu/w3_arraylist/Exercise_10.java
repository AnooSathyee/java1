package com.anu.w3_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_10 {

    public static void main(String[] args) {

        //Shuffle elements in ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("After shuffling >>> \n" + list);
        System.out.println(list);
        // to get a best result shuffle it every time
        Collections.shuffle(list);
        System.out.println(list);
    }
}
