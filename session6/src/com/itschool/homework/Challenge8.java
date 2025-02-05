package com.itschool.homework;

public class Challenge8 {

    public static void main(String[] args) {
        int number = 2;
        int factorial = 2;

        for (int i = 1; i <= number; i++){
            factorial *=i;
        }

        System.out.println("factorial: " + factorial);

    }
}
