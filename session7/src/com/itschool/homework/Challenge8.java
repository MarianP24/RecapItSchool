package com.itschool.homework;

public class Challenge8 {

    public static void main(String[] args) {
        Challenge8 challenge8 = new Challenge8();
        challenge8.fiboPrint();
    }

    public void fiboPrint() {
        int first = 0;
        int second = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
