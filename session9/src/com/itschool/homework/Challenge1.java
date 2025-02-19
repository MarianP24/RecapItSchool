package com.itschool.homework;

import java.time.LocalDate;

public class Challenge1 {

    public static void main(String[] args) {
        Challenge1 challenge1 = new Challenge1();
        challenge1.date();
    }

    public void date() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
