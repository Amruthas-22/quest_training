package com.quest.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("File2.txt");
        file.delete();
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line1 = sc.nextLine();
                System.out.println(line1);

            }
            sc.close();

        } else {
            System.out.println("File not exists");
        }


        /*Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line1 = sc.nextLine();
            System.out.println(line1);
        }*/
    }
}
