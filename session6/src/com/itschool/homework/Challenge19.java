package com.itschool.homework;

import com.itschool.scanner.InputReader;
import com.itschool.scanner.ScannerInputReader;

public class Challenge19 {

    private final InputReader inputReader;

    public Challenge19(InputReader inputReader){
        this.inputReader = inputReader;
    }

    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        Challenge19 challenge19 = new Challenge19(inputReader);
        challenge19.classifes();

    }

    public void classifes() {
        System.out.print("insert age: ");
        int age = inputReader.readInt();

        String classification = (age < 12) ? "Child" :
                (age >= 12 && age <= 17) ? "Teenager" :
                        (age >= 18 && age <= 64) ? "Adult" :
                                "Senior";
        System.out.println(classification);
    }
}
