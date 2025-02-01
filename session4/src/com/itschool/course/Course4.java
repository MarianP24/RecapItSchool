package com.itschool.course;

public class Course4 {

    public static void main(String[] args) {
        String firstName = "Marian";
        String lastName = "Paraianu";

        System.out.println(firstName + lastName);

        firstName += lastName;
        System.out.println(firstName);

        boolean trueVar = true;
        System.out.println("trueVar is " + trueVar);

        System.out.println("negation of trueVar is " + !trueVar);

        int h = 12;
        long j = 12L;
        System.out.println("h + j =  " + (h +j));
    }
}
