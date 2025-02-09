package com.itschool.homework;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Challenge5 challenge5 = new Challenge5();
        challenge5.fibo();
    }

    public void fibo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please give a positive number");
        } else {
            int first = 0;
            int second = 1;

            //fiecare număr este suma celor două numere precedente

            for (int i = 1; i <= number; i ++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
