package com.vetias.java.workshop.basics.array;

public class StringExample {
    public static void main(String[] args) {
       
        // String firstname = "Thowfiq";
        // String lastname = "Mohamed";
        // System fullname= firstname + " " + lastname;
        // String firstname=firstname.concat(lastname);
        // System.out.println(firstname);
        // System.out.println(lastname);
        String text="this program shows how we can split a string into multiple.words and print them out one by one";
        String [] words = text.split(" ");
        String[] Sentances=text.split("\\.");
        System.out.println(words.length);
        System.out.println(Sentances.length);
        System.out.println(text.length());
        
        // for (String word : words) {
        //     System.out.println(word);
        // }   
    }
}
