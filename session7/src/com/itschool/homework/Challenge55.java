package com.itschool.homework;

import java.util.Scanner;

public class Challenge55 {

    public static void main(String[] args) {
        Challenge55 run = new Challenge55();
        run.fibo();
    }

    public void fibo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int a = input.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 0; i < a; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

