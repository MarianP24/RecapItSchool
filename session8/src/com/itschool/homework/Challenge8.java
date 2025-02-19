package com.itschool.homework;

public class Challenge8 {

    public static void main(String[] args) {
        Challenge8 challenge8 = new Challenge8();
        challenge8.inserting();
    }

    public void inserting() {
        StringBuilder word = new StringBuilder("La gara");
        System.out.println(word);
        String word2 = "acasa";

        word.insert(2,word2);

        System.out.println(word);
    }
}
