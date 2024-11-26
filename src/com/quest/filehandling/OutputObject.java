package com.quest.filehandling;

import java.io.*;

public class OutputObject {
    public static void main(String[] args) {
        String s = "Added Content";
        try {
//            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("File5.txt",true));
//            bos.write(s.getBytes());
//            System.out.println("buffer data is added sucessfully");
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File2.txt"));
            int c;
            while((c=bis.read())!=-1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
