package com.quest.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreateAndDel {
    public static void main(String[] args) {
        File file = new File("File3.txt");
        try {

            if (file.createNewFile() || file.exists())  {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred during file creation.");
            e.printStackTrace();
        } finally {
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}
