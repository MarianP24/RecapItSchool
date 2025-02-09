package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge1 {

    private final InputReader inputReader;

    public Challenge1 (InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge1 challenge1 = new Challenge1(inputReader);
        challenge1.evenNumber();
    }

    public void evenNumber() {
        System.out.print("Give me a number: ");
        int number = inputReader.readInt();

        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}
