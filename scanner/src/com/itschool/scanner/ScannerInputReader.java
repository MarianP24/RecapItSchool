package com.itschool.scanner;

import java.util.Scanner;

public class ScannerInputReader implements InputReader{

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public int readInt() {
        return scanner.nextInt();
    }

    @Override
    public String readString() {
        return scanner.nextLine();
    }

    @Override
    public double readDouble(){
        return scanner.nextDouble();
    }
}
