package com.itschool.course;

public class Course1 {

    static double amount = 11.7;

    public static void main(String[] args){
        amount = 20.9;
        System.out.println(amount);
        method2();
    }

    public static void method2(){
        amount = 15;
        System.out.println(amount);
    }
}
