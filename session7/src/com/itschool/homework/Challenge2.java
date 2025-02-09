package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge2 {

    private final InputReader inputReader;

    public Challenge2 (InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge2 challenge2 = new Challenge2(inputReader);
        challenge2.month();
    }

    public void month() {
        System.out.print("Give a number between 1 and 12: ");
        int number = inputReader.readInt();

        switch (number) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("Mai");
            case 6 -> System.out.println("Iunie");
            case 7 -> System.out.println("Iulie");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("Sept");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month");
        }
    }
}
