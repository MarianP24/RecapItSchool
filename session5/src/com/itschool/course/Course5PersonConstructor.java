package com.itschool.course;

public class Course5PersonConstructor {

    public static void main(String[] args) {
        Person marina = new Person(898898,"Marian");
        System.out.println(marina.getCnp());
        System.out.println(marina.getLastName());

        String lastName = marina.getLastName();
        System.out.println(lastName);

    }


}
