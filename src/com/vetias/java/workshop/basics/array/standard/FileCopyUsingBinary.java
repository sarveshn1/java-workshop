package com.vetias.java.workshop.basics.array.standard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("anu.jpg");
             FileOutputStream outputStream = new FileOutputStream("output.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error during file copy: " + e.getMessage());
        }
    }
}
