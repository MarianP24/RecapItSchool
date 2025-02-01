package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge2 {

    private final InputReader inputReader;

    public Challenge2(InputReader inputReader){
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge2 challenge2 = new Challenge2(inputReader);
        challenge2.inDecrement();
        challenge2.reverseSign();
    }

    public void inDecrement(){
        int a = 12;
        System.out.println("increment of " + a + " is " + ++a);
        System.out.println("decrement of " + a + " is " + --a);
    }

    public void reverseSign(){
        System.out.print("Introdu u numar negativ: ");
        int b = inputReader.readInt();
        System.out.print("Numarul pozitiv este: " + -b);
    }
}
