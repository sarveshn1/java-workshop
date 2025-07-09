package com.vetias.java.workshop.basics.array;

public class Calculator {
  public int add(int a, int b) {
    return a + b;
  }
    public int subtraction(int a, int b) {
            return a - b;
        }
    public int multiplication(int a, int b) {
        return a * b;
    }   
    public int division(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtraction(a, b));
        System.out.println("Multiplication: " + calculator.multiplication(a, b));
        System.out.println("Division: " + calculator.division(a,b));
    }
}

