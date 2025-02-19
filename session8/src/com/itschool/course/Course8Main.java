package com.itschool.course;

public class Course8Main {

    public static void main(String[] args) {
//        Person marian = new Person(51,"Marian");
//        marian.getName();
//        marian.getAge();

        Person person = new Person();
        person.setName("Marian");
        person.setAge(51);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        String text = "random text";
        System.out.println("Original text: " + text);

        String upperText = text.toUpperCase();

        System.out.println("Text after toUpperCase(): " + upperText);
    }
}
