package com.dheepak.learning.java.ocp_practice;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getDayOfWeek());
        LocalDate localDate = LocalDate.of(1998, Month.AUGUST,  10);
        System.out.println(localDate.getDayOfYear());

        boolean b = 0.1*3 == 0.3;
        boolean c = 0.1*2 == 0.2;
        System.out.println(b);
        System.out.println(c);
    }
}
