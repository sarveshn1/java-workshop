package com.vetias.java.workshop.basics.array;

import java.time.LocalDate;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your year of birth(YYYY-MM-DD):");
        String yearofbirth= inputScanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(yearofbirth);
        int currentyear= LocalDate.now().getYear();
        int age = currentyear - dateOfBirth.getYear();
        System.out.println("age: " + age);
    }
}
