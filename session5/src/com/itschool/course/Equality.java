package com.itschool.course;

public class Equality {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        boolean isEqual = a == b;
        System.out.println(isEqual);

        String x = "marian";
        String y = "marian";

        System.out.println("Adevarat sau fals: " + (x == y));

        String aName = new String("dan");
        String bName = new String("dan");

        System.out.println(aName == bName);         //false
        System.out.println(aName.equals(bName));    //true

        comparePerson();  //false
    }

    static void comparePerson(){
        Person person1 = new Person(555L,"mihai");
        Person person2 = new Person(555L,"dan");

        System.out.println(person1.equals(person2));
    }
}
