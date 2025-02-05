package com.itschool.homework;

public class Challenge7 {

    public static void main(String[] args) {
        int sideOne = 10;
        int sideTwo = 25;
        int sideThree = 6;
        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
                (sideOne == sideTwo && sideTwo == sideThree && sideOne == sideThree) ? "Isoscel" : "Scalene";

        System.out.println(triangleType);
    }
}
