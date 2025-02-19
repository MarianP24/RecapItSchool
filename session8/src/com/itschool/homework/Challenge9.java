package com.itschool.homework;

import java.util.HashSet;

public class Challenge9 {

    public static void main(String[] args) {
        Challenge9 challenge9 = new Challenge9();
        challenge9.counter();
    }

    public void counter() {
        StringBuilder word = new StringBuilder("Ce frumos este afara");
        HashSet<Character> processedChars = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int characterAppereance = 0;
            if (processedChars.contains(character) || character == ' ') {
                continue;
            }
            for (int j = 0; j < word.length(); j++) {
                if (character == word.charAt(j)) {
                    characterAppereance++;
                }
            }
            processedChars.add(character);
            System.out.println(character + " appears " + characterAppereance + " times in the " + word);
        }
    }
}
