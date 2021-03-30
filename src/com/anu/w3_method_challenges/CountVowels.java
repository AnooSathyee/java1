package com.anu.w3_method_challenges;

import java.util.Scanner;

public class CountVowels {

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String >>> ");
        String str = input.nextLine();
        int x = countVowels(str);
        System.out.println("Total number of vowels in the string >>> " + x);
    }
}

