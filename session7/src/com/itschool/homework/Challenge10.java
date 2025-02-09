package com.itschool.homework;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        Challenge10 challenge10 = new Challenge10();
        challenge10.jmpStatement();
    }

    public void jmpStatement() {
        Scanner input = new Scanner(System.in);
        int choosenOption;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print \"Hello World\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            choosenOption = input.nextInt();

            switch (choosenOption) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2: {
                    System.out.println("Insert your name");
                    String name = input.nextLine();
                    System.out.println("You insert: " + name);
                    break;
                }
                case 3: {
                    System.out.println("Exit");
                }
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choosenOption != 3);
    }
}
