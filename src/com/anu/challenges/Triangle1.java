package com.anu.challenges;

public class Triangle1 {

    int a;
    int b;
    int c;

    public Triangle1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        double p = (a+b+c)/2;
        return Math.pow(p*(p-a) * (p-b) * (p-c),.5);
    }

    public double perimeter(){
        return (a+b+c)/2;
    }

}

class Driver{

    public static void main(String[] args) {
        Triangle1 t = new Triangle1(3,4,5);

        System.out.println("Area of a triangle >>> " + t.area());
        System.out.println("Perimeter of a triangle >>> " + t.perimeter());
    }
}