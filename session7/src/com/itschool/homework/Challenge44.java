package com.itschool.homework;

import java.util.Scanner;

public class Challenge44 {

    public static void main(String[] args) {
        Challenge44 run = new Challenge44();
        run.stringReverser();
    }

    public void stringReverser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert a string: ");
        String something = input.next();

        String revStr = new StringBuilder(something).reverse().toString();
        System.out.println("The reversed string is: ");
        System.out.println(revStr);
    }
}
