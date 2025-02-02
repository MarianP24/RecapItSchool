package com.itschool.homework;

public class Challenge7 {

    public static void main(String[] args) {
        Challenge7 challenge7 = new Challenge7();
        challenge7.promotion();
        challenge7.byteVar();
    }

    public void promotion(){
        int a = 5;
        double b = 46.2d;
        System.out.println(a + " + " + b + " = " + (a +b));
    }

    public void byteVar(){
        byte firstByte = 21;
        byte secondByte = 14;
        byte thirdByte = (byte) (firstByte + secondByte);
        System.out.println(thirdByte);
    }
}
