package com.vetias.java.workshop.basics.array.standard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterBasicReader {
    
    public static void main(String[] args) {
        String filePath = "src/com/vetias/java/workshop/basics/array/standard/characters.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }   
}
