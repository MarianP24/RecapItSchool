package com.itschool.homework;

public class Challenge1 {

    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        System.out.println(stringOne.hashCode());
        System.out.println(stringTwo.hashCode());
        System.out.println("Au acelasi obiect in memorie stringOne si stringTwo" + stringOne == stringTwo);
    }
}
