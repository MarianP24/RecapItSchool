package com.itschool.homework;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        Challenge11 challenge11 = new Challenge11();
        challenge11.average();
    }

    public void average() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int number;

        do {
            System.out.print("Insert a number: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            sum +=number;
            counter++;
        } while (true);

        if (counter > 0) {
            double ave = (double) sum/counter;
            System.out.println("The average is: " + ave);
        } else {
            System.out.println("No numbers were entered");
        }
    }
}
