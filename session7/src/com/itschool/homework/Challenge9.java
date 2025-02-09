package com.itschool.homework;

public class Challenge9 {

    public static void main(String[] args) {
        Challenge9 challenge9 = new Challenge9();
        challenge9.loopHole();
    }

    public void loopHole() {
        int[] array = {5,6,9,10,57,45,63,2,985};

        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }
        }
    }
}
