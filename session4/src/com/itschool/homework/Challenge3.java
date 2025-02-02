package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge3 {

    private final InputReader inputReader;

    public Challenge3(InputReader inputReader){
        this.inputReader = inputReader;
    }


    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge3 challenge3 = new Challenge3(inputReader);
        challenge3.negativePositive();
        challenge3.booleans();
    }

    public void negativePositive(){
        System.out.print("Insert a number: ");
        int a = inputReader.readInt();
        if (!(a < 0)) {
            System.out.println("Your number is positive");
            }
            else {
                System.out.println("Your number is negative");
            }
    }

    public void booleans(){
        System.out.println("Tell me, true or false?");
        boolean b = Boolean.parseBoolean(inputReader.readString());
        System.out.println(!b);
        System.out.println("Try again!");
        boolean c = Boolean.parseBoolean(inputReader.readString());
        System.out.println(!c);
    }
}
