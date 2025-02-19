package com.itschool.homework;

public class Challenge7 {

    public static void main(String[] args) {
        Challenge7 challenge7 = new Challenge7();
        challenge7.dupli();
    }

    public void dupli() {
        StringBuilder duplicate = new StringBuilder("Football");
        System.out.println(duplicate);

        for (int i = 0; i < duplicate.length(); i++) {
            if (duplicate.charAt(i) == duplicate.charAt(i+1)) {
                duplicate.deleteCharAt(i);
            }
        }

        System.out.println(duplicate);
    }

}
