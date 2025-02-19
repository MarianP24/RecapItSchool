package com.itschool.homework;

public class Challenge2 {

    public static void main(String[] args) {
        Challenge2 challenge2 = new Challenge2();
        challenge2.palindrom();
    }

    public void palindrom() {
        String word = "elefant";
        StringBuilder palindrom = new StringBuilder(word).reverse();

        if (word.equals(palindrom.toString())) {
            System.out.println(word + " este palindrom");
        } else {
            System.out.println(word + " nu este palindrom");
        }
    }
}
