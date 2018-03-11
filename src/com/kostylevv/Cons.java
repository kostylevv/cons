package com.kostylevv;

import java.time.LocalDate;

public class Cons {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today.toString());
        System.out.println("EoW: " + (7 - today.getDayOfWeek().getValue()));
        System.out.println("EoM: " + (today.lengthOfMonth() - today.getDayOfMonth()));
        System.out.println("EoY: " + (today.lengthOfYear() - today.getDayOfYear()));
        System.out.println("BDay: " + (LocalDate.of(2018, 11, 5).getDayOfYear() - today.getDayOfYear()));
        System.out.println("EoL: " + (2060 - today.getYear()));


    }
}
