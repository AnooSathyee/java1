package com.anu.java8;

@FunctionalInterface
interface Printing {
    public void print();

}

@FunctionalInterface
interface OneParam{
    public void print(int a);
}

@FunctionalInterface
interface TwoParam{
    public void print(int a, int b);
}

@FunctionalInterface
interface Addition{
    public int add(Integer a, Integer b);
}

public class Predefined {

    public static void main(String[] args) {
        Predefined obj = new Predefined();
        obj.printing();
        Printing p = () -> System.out.println("Hello Anu");
        p.print();
        OneParam p1 = (a)-> System.out.println(a);
        p1.print(10);
        TwoParam p2 = (a, b)-> System.out.println(a + b);
        p2.print(5,10);
        Addition a = (x, y) -> {
            System.out.println("First Number >>> " + x);
            System.out.println("Second Number >>> " + y);
            int result = x + y;
            //System.out.println(result);
            return result;
        };
        System.out.println(a.add(10,20));
    }

    //saving a method inside a variable --more or less like that
    public void printing() {
        //System.out.println("Hello");
    }
}
