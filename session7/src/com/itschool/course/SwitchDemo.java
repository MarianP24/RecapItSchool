package com.itschool.course;

public class SwitchDemo {

    public static void main(String[] args) {
        int var = 1;
        classicSwitch(var);
        enhancedSwitch(var);
    }

    private static void classicSwitch(int variable) {
        switch (variable) {
            case 1: // daca variable este egala cu 1 atunci sout
                System.out.println("value is 1");
                break;
            case 2: // daca variable este egala cu 2 atunci sout
                System.out.println("value is 2");
                break;
            case 5:
                System.out.println("value is 5");
                break;
            default: // pentru orice altceva sout, este pus ultimul
                System.out.println("value unknown");
        }
    }

    private static void enhancedSwitch(int variable) {
        switch (variable) {
            case 1 -> {
                System.out.println("value is 1");
                System.out.println("extras");
            }
            case 2 -> System.out.println("value is 2");
            case 3 -> System.out.println("value is 3");
            case 5 -> System.out.println("value is 5");
            default -> System.out.println("unknown value");
        }
    }
}
