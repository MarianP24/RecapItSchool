package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge20 {

    private final InputReader inputReader;

    public Challenge20(InputReader inputReader){
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge20 challenge20 = new Challenge20(inputReader);
        challenge20.largestNumber();
    }

    public void largestNumber() {
        System.out.print("Insert number1: ");
        int number1;
        try {
            number1 = inputReader.readInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.print("Insert number2: ");
        int number2;
        try {
            number2 = inputReader.readInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.print("Insert number3: ");
        int number3;
        try {
            number3 = inputReader.readInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int largeNumber = (number1 > number2 && number1 > number3) ? number1 :
                (number2 > number1  && number2 > number3) ? number2 : number3;

        System.out.println(largeNumber);
    }
}
