package com.itschool.course;

public class SwitchSeason {

    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case AUTUMN -> System.out.println("one");
            case SPRING -> System.out.println("two");
            case SUMMER -> System.out.println("three");
            case WINTER -> System.out.println("four");
            default -> System.out.println("lala");
        }
    }
}
