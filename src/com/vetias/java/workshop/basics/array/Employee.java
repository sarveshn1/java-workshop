package com.vetias.java.workshop.basics.array;

import java.util.Arrays;

public class Employee {
    public static void main(String[] args) {
        String[][] employees= new String[5][2];
        employees[0][0]="thowfiq.ep1";
        employees[0][1]="10000";
        employees[1][0]="sachin.ep2";
        employees[1][1]="12000";
        employees[2][0]="mugunthan.ep3";
        employees[2][1]="13000";
        employees[3][0]="vishal.ep4";
        employees[3][1]="14000";
        employees[4][0]="sarvesh.epb5";
        employees[4][1]="60000";
     for(String[]employee:employees){
        System.out.println(Arrays.toString(employee));
     }
     
}
}
