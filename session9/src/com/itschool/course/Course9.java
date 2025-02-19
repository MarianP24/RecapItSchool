package com.itschool.course;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Course9 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int dayOfYear = localDate.getDayOfYear();

        System.out.println(dayOfYear);
        System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(formatter));
    }
}
