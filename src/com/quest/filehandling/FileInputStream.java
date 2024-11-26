package com.quest.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Streams {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("File2.txt");
            System.out.println("file created sucessfully" );
            int c;
            String str = "input a string";
            FileOutputStream fos = new FileOutputStream("File2.txt");
            System.out.println(fis.read());
            fos.write(str.getBytes());
            while ((c = fis.read()) != -1) {
             System.out.print((char) c);
            }
            fos.close();
//           // fis.read();
            fis.close();
            System.out.println("\n file stream is closed");
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
