package com.itschool.homework;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        enterNumber();
    }

    public static void enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.println("addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
    }
}
