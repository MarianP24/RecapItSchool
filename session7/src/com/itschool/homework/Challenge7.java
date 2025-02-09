package com.itschool.homework;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        Challenge7 challenge7 = new Challenge7();
        challenge7.looping();
    }

    public void looping() {
        Scanner input = new Scanner(System.in);
        int predefinedNumber = 20;
        int number;

        do {
            System.out.print("Guess the number: ");
            number = input.nextInt();
            if (number < predefinedNumber) {
                System.out.println("Your number is too low");
            } else if (number > predefinedNumber) {
                System.out.println("Your number is too high");
            }
        } while (number != predefinedNumber);
    }

}
