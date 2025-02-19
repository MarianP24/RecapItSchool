package com.itschool.course;

public class RedoArrays {

    public static void main(String[] args) {

        int[][] complexArray = {{17, 27, 37}, {47, 57, 67}, {77, 87, 97}};
        for (int i = 0; i < complexArray.length; i++) {
            for (int j = 0; j < complexArray[i].length; j++) {
                System.out.print(complexArray[i][j] + " ");
            }
            System.out.println();
        }

        RedoArrays redo = new RedoArrays();
        redo.redoArrays();
    }

    public void redoArrays() {
        int[] simpleArray1 = {11, 22, 33};
        int[] simpleArray2 = {44, 55, 66};
        int[] simpleArray3 = {77, 88, 99};

        int[][] complexArray = {simpleArray1, simpleArray2, simpleArray3};
        for (int[] simpleArray : complexArray) {
            for (int element : simpleArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
