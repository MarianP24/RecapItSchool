package com.itschool.course;

public class WhileDemo {

    public static void main(String[] args) {
        int number = 5;
        while (number < 10) {
            System.out.println("The number is: " + number);
            number++;
        }

        do {
            System.out.println("The number is: " + number);
            number++;
        } while (number < 10);

    }
}
