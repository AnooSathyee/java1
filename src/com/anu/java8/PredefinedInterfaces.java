package com.anu.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class PredefinedInterfaces {

    public static void main(String[] args) {

        //Supplier Interface--will not accept but return -> getting something
        Supplier<String> s = () -> "Java8 Supplier";
        String a = s.get();
        System.out.println(a);

        //Consumer Interface -- will accept but not return anything
        Consumer<String> con = (b) -> System.out.println(b);
        con.accept("Java8 Consumer");

        //BiConsumer Interface
        BiConsumer<String, String> biCon = (m, n) -> System.out.println(m + n);
        biCon.accept("hello ", "Anu");

        //Predicate is to test something --> checking the boolean condition
        Predicate<String> p = (c) -> c.length() == 5;
        System.out.println("Testing the predicate condition >>> " + p.test("Anu"));

        //And Condition
        Predicate<String> p1 = (a1) -> a1.length() == 5;
        Predicate<String> p2 = (a2) -> a2.length() < 6;
        Predicate<String> p3 = p1.and(p2);
        System.out.println("BiPredicate Result" + p3.test("TestJa"));

        //Negate in predicate interface
        //Predicate<Integer> p4 = ()

        //BiPredicate will accept 2 parameters
        BiPredicate<String, String> biPre = (d, e) -> d.equalsIgnoreCase(e);
        System.out.println("Bipredicate result >>> " + biPre.test("One", "one"));

        //Function will accept the parameter and will return as well
        Function<String, String> f = (g)->g.toUpperCase();
        System.out.println(f.apply("java8"));

        //BiFunction takes two param
        BiFunction<String, String, Integer> biF = (h, i) -> h.length() + i.length();
        System.out.println("BiFunction Output " + biF.apply("Hello ", "Java"));

        //ForEach java 8
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Grapes");
        list.forEach(System.out::println);

    }
}
