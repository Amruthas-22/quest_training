package com.quest.filehandling;

import java.io.*;

public class StreamReadAndWrite {
    public static void main(String[] args) {
        File file = new File("File4.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        String content = "\nHi,"
                + "\nI am Amrutha."
                + "\nNice to meet you,"
                + "\nGood afternoon,"
                + "\nBeautiful.";
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(content.getBytes());
            System.out.println("Initial content written to the file successfully.");
            fos.close();
        } catch (IOException e) {
            System.out.println("An error occurred during writing.");
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            fos.write("\n This is the first additional line.".getBytes());
            fos.write("\n Here's another line.".getBytes());
            fos.write("\n Yet another line here.".getBytes());
            fos.write("\n We're still adding lines.".getBytes());
            fos.write("\n Final line added.".getBytes());
            System.out.println("Additional 5 lines written to the file successfully.");
            fos.close();
        } catch (IOException e) {
            System.out.println("An error occurred during appending.");
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            System.out.println("Reading content from the file:");
            int contentChar;

            while ((contentChar = fis.read()) != -1) {
                System.out.print((char) contentChar);
            }

        } catch (IOException e) {
            System.out.println("An error occurred during reading.");
            e.printStackTrace();
        }
    }
}
