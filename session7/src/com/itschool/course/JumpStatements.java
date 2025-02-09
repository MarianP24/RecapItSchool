package com.itschool.course;

public class JumpStatements {

    private static final int LUCKY_NUMBER = 3;

    public static void main(String[] args) {
        breakStatement();
    }

    private static void breakStatement() {
        int[] array = {1, 2, 3, 4, 5};
        for (int element : array) {
            System.out.println("At start element is " + element);
            if (element == LUCKY_NUMBER) {
                System.out.println("Found my lucky number");
                break;
            }
            System.out.println("At end element is " + element);
        }
        System.out.println("=======Program end=========");
    }
}
