package com.anu.challenges;

public class Student {

    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("John", 2);
        System.out.println(student);
    }

}
