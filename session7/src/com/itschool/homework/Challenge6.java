package com.itschool.homework;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Challenge6 challenge6 = new Challenge6();
        challenge6.prompting();
    }

    public void prompting() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while (number != -1) {
            sum += number;
            System.out.print("Give me a number: ");
            number = input.nextInt();
        }

        System.out.println(sum);
    }
}
