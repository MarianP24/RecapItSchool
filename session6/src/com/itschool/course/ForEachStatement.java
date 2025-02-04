package com.itschool.course;

public class ForEachStatement {

    public static void main(String[] args) {
        String[] array = {"text1","text2","text3"};

        int[] intArray = {1,2,3,4};

        for(int number : intArray) {
            System.out.println("Number is: " + number);
        }

        int[] intArray2 = {7,8,9,4};
        for(int number2 = 0; number2 < intArray2.length; number2++){
            //System.out.println(number2); // imi da pozitia nu valorea
            System.out.print(intArray2[number2] + " ");
        }
    }
}
