package com.itschool.course;

public class Equality2 {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.1;

        System.out.println(x == y);

        Boolean a = true;
        boolean b = false;

        System.out.println(a.equals(b));

        String nullVar = null;
        String notNullVar = "text";

        System.out.println("Comparing null with not null with ==");
        System.out.println(nullVar == notNullVar);

        System.out.println("Comparing null with not null with equals");
        System.out.println(nullVar.equals(notNullVar)); // error comparatie null cu ceva, trebuie ceva cu null sa mearga

    }
}
