package com.itschool.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge10 {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("mar", "banana", "nuci"));

        ArrayList<String> listTwo = new ArrayList<>(listOne);

        System.out.println(listTwo);

        listOne.add("vaci");

        System.out.println(listOne);
        System.out.println(listTwo);
    }
}
