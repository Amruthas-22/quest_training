package com.quest.practise;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringFileRead {
    public static void main(String[] args) {

                String filePath = "File2.txt";
                String contentToWrite = "We are learning Java programming.";
                String searchString = "Java";

                try (FileOutputStream fos = new FileOutputStream(filePath)) {
                    fos.write(contentToWrite.getBytes());
                    System.out.println("File created and content written successfully.");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                    e.printStackTrace();
                }

                try (FileInputStream fis = new FileInputStream(filePath)) {
                    System.out.println("File opened successfully");

                    int c;
                    boolean found = false;
                    StringBuilder fileContent = new StringBuilder();

                    while ((c = fis.read()) != -1) {
                        fileContent.append((char) c);
                    }

                    if (fileContent.toString().contains(searchString)) {
                        System.out.println("Found string '" + searchString + "' in the file.");
                    } else {
                        System.out.println("String '" + searchString + "' not found in the file.");
                    }
                } catch (IOException e) {
                    System.out.println("Error reading the file: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }



