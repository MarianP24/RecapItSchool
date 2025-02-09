package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge1 {

    private final InputReader inputReader;

    public Challenge1(InputReader inputReader){
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader(); // Instanțiază InputReader
        Challenge1 challenge1 = new Challenge1(inputReader); // Injectează InputReader
        challenge1.inputNumber();
        challenge1.rectangleArea();

    }

    public void inputNumber() {
        System.out.println("Introdu primul numar:");
        int a = inputReader.readInt();
        System.out.println("Introdu al doilea numar:");
        int b = inputReader.readInt();
        operations(a, b);
    }

    public void operations(int a, int b) {
        System.out.println("Additon = " + (a + b));
        System.out.println("Substraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }

    public void rectangleArea(){
        System.out.println("Introdu lungimea: ");
        int length = inputReader.readInt();
        System.out.println("Introdu latimea: ");
        int breadth = inputReader.readInt();
        System.out.println("Rectangle Area is: " + (length * breadth));
    }
}
