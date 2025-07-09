package com.vetias.java.workshop.basics.array;

import java.util.Scanner;

public class Namegenerator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your name");
            String name = scanner.nextLine();
            System.out.println("enter tha age");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline
            System.out.println("enter your fav colour:");
            String colour = scanner.nextLine();
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Favourite Colour: " + colour);
        }
    }