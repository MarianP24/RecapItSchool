package com.itschool.homework;

public class Challenge33 {

    public static void main(String[] args) {
        Challenge33 run = new Challenge33();
        run.negativeNumber();
    }

    public void negativeNumber() {
        int[] array = {1, 3, -5, -8, 8, 6};
        int counter = 0;

        for (int i : array) {
            if (i < 0) {
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
