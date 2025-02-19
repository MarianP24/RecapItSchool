package com.itschool.homework;

public class Challenge4 {

    public static void main(String[] args) {
        Challenge4 challenge4 = new Challenge4();
        challenge4.vowels();
    }

    public void vowels() {
        String vocale = "aeiou";
        String propozitie = "De inlaturat vocalele din propozitia asta";

        System.out.println(propozitie);

        StringBuilder removed = new StringBuilder();

        for (int i = 0; i < propozitie.length(); i++) {
            char c = propozitie.charAt(i);

            if (vocale.indexOf(Character.toLowerCase(c)) == -1) {
                removed.append(c);
            }
        }

        System.out.println(removed);
    }
}
