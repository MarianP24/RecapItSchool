package com.itschool.homework;

public class Challenge6 {

    public static void main(String[] args) {
        Challenge6 challenge6 = new Challenge6();
        challenge6.replacement();
    }

    public void replacement() {
        String word1 = "The cat sat on the mat";
        System.out.println(word1);
        String word2 = "dog";
        String target = "cat";

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < word1.length()) {
            if (i + target.length() <= word1.length() && word1.substring(i, i + target.length()).equals(target)) {
                result.append(word2);
                i += target.length();
            } else {
                result.append(word1.charAt(i));
                i++;
            }
        }

        System.out.println(result);
    }
}
