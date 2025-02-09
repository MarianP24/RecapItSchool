package com.itschool.homework;

public class Challenge17 {

    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = false;

        if (hasPassword && hasUsername) {
            System.out.println("Authentification succesful");
        } else if (!hasPassword && !hasUsername) {
            System.out.println("Authentification failed");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }
    }
}
