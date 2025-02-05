package com.itschool.homework;

public class Challenge6 {

    public static void main(String[] args) {
        int temperature = 15;

        if (temperature > 30){
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");
        } else if (temperature < 20){
            System.out.println("Cold");
        }
    }
}
