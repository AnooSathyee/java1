package com.anu.practice;

public class SearchingStringMethods {

    public static void main(String[] args) {

        SearchingStringMethods s = new SearchingStringMethods();

        String s1 = " pack my box with five dozen liquor jugs ";
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf('t',3 ));

        // character extraction
        System.out.println(s1.charAt(10));
        System.out.println(s1.substring(12,27));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(s1.length());
        //System.out.println(s1.strip());

        StringBuilder sb = new StringBuilder("unA");
        System.out.println(sb.reverse());
        String[] names = {"Anu ", "Sathiya ", "Vaishu ", "Anya"};
        s.joinWords(names);

    }
    public void joinWords(String[] names){
        String sentence = "";
        StringBuffer sb = new StringBuffer("");
        for(String name : names){
            sb.append(name);
            sentence += name;
        }
        System.out.println(sentence);
    }
}
