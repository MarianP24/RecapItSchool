package com.itschool.homework;

import java.util.ArrayList;

public class Challenge18 {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int value : numbers){
            System.out.println(value);
        }

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i - 1;
        }

        for (int value : numbers){
            System.out.println(value);
        }
    }
}
