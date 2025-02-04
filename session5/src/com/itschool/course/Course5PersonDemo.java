package com.itschool.course;

public class Course5PersonDemo {

    public static void main(String[] args) {
        Person marian = new Person();

        marian.setFirtName("Marian");
        marian.setAge(100);
        marian.setCnp(8989898898L);

        System.out.println(marian.getFirtName());

        System.out.println(marian.getAge());

        System.out.println(marian.getCnp());

        printStuff(marian);

    }

    static void printStuff(Person aPerson){
        System.out.println(aPerson.getCnp());
        System.out.println(aPerson.getFirtName());
    }
}
