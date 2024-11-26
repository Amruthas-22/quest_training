package com.quest.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("FileWriter1.txt");
            fw.write("Hello World file writer eg");
            fw.append('a');
           fw.append("@1234",1,10);

            fw.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
