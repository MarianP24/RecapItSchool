package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge4 {

    private final InputReader inputReader;

    public Challenge4(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge4 challenge4 = new Challenge4(inputReader);
        challenge4.stringReverse();
    }

    public void stringReverse() {
        System.out.print("Insert a string: ");
        String stringEntered = inputReader.readString();

        String reversedString = new StringBuilder(stringEntered).reverse().toString();

        System.out.println("Your reveresed string is: " + reversedString);
    }
}
