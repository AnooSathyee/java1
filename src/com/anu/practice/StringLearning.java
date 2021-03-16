package com.anu.practice;

public class StringLearning {


    public static void main(String[]rgs) {

        String name1 = "Anya";
        String name = new String("Anu");
        System.out.println(name1 + " is " + name +"'s daughter");
        System.out.println(name.length());
        System.out.println(name.isEmpty());

        String s1 = new String("Anu");// Heap Memory
        String s2 = s1;//"Anu"; //String Constant Pool
        System.out.println(s1.equals((s2)));
        if(s1 == s2){
            System.out.println("bbbequal");
        } else{
            System.out.println("not equal");
        }

        if (s1.equals(s2)) {
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        String o1 = new String("Anu");
        String o2 = new String("anu");
        boolean result = o1.equals(o2);
        System.out.println(result);
        result=o1.equalsIgnoreCase(o2);
        System.out.println(result);
        int reslt = o1.compareToIgnoreCase(o2);
        System.out.println(reslt);

    }
}

