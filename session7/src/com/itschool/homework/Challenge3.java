package com.itschool.homework;

public class Challenge3 {

    public static void main(String[] args) {
        Challenge3 challenge3 = new Challenge3();
        challenge3.counterNegative();
    }

    public void counterNegative() {
        int[] array = {1,2,-3,4,-15,16,-18};

        int counter = 0;

        for (int i : array) {
            if (i < 0) {
                System.out.println(i + " is a negative number");
                counter ++;
            }
        }

        System.out.println("Number of negative numbers in array is: " + counter);
    }
}
