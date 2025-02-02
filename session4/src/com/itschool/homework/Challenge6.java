package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge6 {

    private final InputReader inputReader;

    public Challenge6(InputReader inputReader){
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge6 challenge6 = new Challenge6(inputReader);
        challenge6.greater();
        challenge6.range();
    }

    public void greater() {
        System.out.println("Introdu doua numere: ");
        int a = inputReader.readInt();
        int b = inputReader.readInt();
        if (a > b) {
            System.out.println(a + " este mai mare decat " + b);
        } else if (a < b){
            System.out.println(b + " este mai mare decat " + a);
        } else
        System.out.println("Numerele sunt egale");
    }

    public void range() {
        System.out.println("Give me a number: ");
        try {
            int g = inputReader.readInt();
            if (g <= 100 && g >= 0) {
                System.out.println(g + " is between 0 - 100");
            } else {
                System.out.println(g + " it's not between 0 - 100");
            }
        } catch (Exception e) {
            System.out.println("Invalid number!");
        }
    }
}
