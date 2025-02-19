package com.itschool.homework;

public class Challenge3 {

    public static void main(String[] args) {
        Challenge3 challenge3 = new Challenge3();
        challenge3.concatenate();
    }

    public void concatenate() {
        StringBuilder wordList = new StringBuilder();
        wordList.append("nemurirea").append(" sufletului ").append(1);

        System.out.println(wordList);
    }
}
