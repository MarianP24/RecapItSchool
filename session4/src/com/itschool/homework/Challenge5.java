package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge5 {

    private final InputReader inputReader;

    public Challenge5(InputReader inputReader){
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge5 challenge5 = new Challenge5(inputReader);
        challenge5.demo();
        challenge5.priceDiscount();
    }

    public void demo(){
        int a = 5;
        System.out.println(a + " dupa += 5 devine " + (a += 5));
        System.out.println(a + " dupa -= 2 devine " + (a -= 2));
        System.out.println(a + " dupa /= 2 rezulta " + (a /= 2));
        System.out.println(a + " dupa %= 2 rezulta " + (a %= 2));
    }

    public void priceDiscount(){
        System.out.println("What's the price of the house?");
        double housePrice = inputReader.readDouble();

        System.out.println("What's the discount of the house?");
        double houseDiscount = inputReader.readDouble();

        double discountAmount = housePrice * (houseDiscount / 100);

        System.out.println("House price is " + (housePrice -= discountAmount));

    }
}
