package com.itschool.homework;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Challenge1 challenge1 = new Challenge1();
        challenge1.reverseString();
    }

    public void reverseString () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert some words: ");

        String word = scanner.next();

        StringBuilder rev = new StringBuilder(word);

        System.out.println(rev.reverse());

    }
}
