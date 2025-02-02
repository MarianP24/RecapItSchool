package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge4 {

    private final InputReader inputReader;

    public Challenge4(InputReader inputReader){
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge4 challenge4 = new Challenge4(inputReader);
        challenge4.count();
        challenge4.display();
    }

    public void count(){

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }

        System.out.println();
    }

    public void display(){
        System.out.print("Give me a number: ");
        int a = inputReader.readInt();
        System.out.println("Number incremented is " + ++a + " back decremented is " + --a);
    }
}
