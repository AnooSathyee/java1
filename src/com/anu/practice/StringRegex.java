package com.anu.practice;

public class StringRegex {
    public static void main(String[] args) {
        String s = " Anu Sathiya";
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.trim());
        System.out.println(s.matches("\\w{3} \\w{7}"));
        s = s.replace('u', 'o');
        System.out.println(s);

        System.out.println(s.replaceAll("\\s", "\\_"));

        String s1 = "Yasodha";
        //String s = new String("Tummala");
        String s3 = s1.concat(s);
        System.out.println(s3);
    }


}
