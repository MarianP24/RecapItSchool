package com.itschool.course;

import java.util.Scanner;

public class TernaryOp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Using classic if-else");
        int number = scanner.nextInt();
        int x ;
        if (number > 10) {
            x = 5;
        } else {
            x = 6;
        }
        System.out.println("x is: " + x);

        System.out.println("Using ternary operator");
        int y = number > 10 ? 5 : 6;
        //number este mai mare decat 10? daca da atunxi y este 5 altfel y este 6
        //intrebare? valoare pentru da : valoare pentru nu
        System.out.println("y is: " + y);



    }
}
