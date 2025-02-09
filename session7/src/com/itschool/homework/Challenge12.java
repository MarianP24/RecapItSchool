package com.itschool.homework;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        Challenge12 challenge12 = new Challenge12();
        challenge12.sumOfNumbers();
    }

    public void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i ++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number <= 5) {
                continue;
            }

            sum +=number;
        }

        System.out.println("Sum is: " + sum);
    }
}
