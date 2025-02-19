package com.itschool.course;

public class JumpStatements {

    private static final int LUCKY_NUMBER = 3;

    public static void main(String[] args) {
        JumpStatements jmp = new JumpStatements();
        jmp.breakStatement();
        continueStatement();
    }

    private static void continueStatement() {
        int[] array = {1, 2, 3, 4, 5};
        for (int element : array) {
            System.out.println("At start elem   ent is: " + element);
            if (element == LUCKY_NUMBER) {
                System.out.println("found my lucky number! I don't care about the rest");
                continue;
            }
            System.out.println("At end element is: " + element);
        }
        System.out.println("===========program end===========");
    }


    private void breakStatement() {
        int[] array = {1, 2, 3, 4, 5};
        for (int element : array) {
            System.out.println("At start elem   ent is: " + element);
            if (element == LUCKY_NUMBER) {
                System.out.println("found my lucky number! I don't care about the rest");
                break;
            }
            System.out.println("At end element is: " + element);
        }
        System.out.println("===========program end===========");
    }
}
