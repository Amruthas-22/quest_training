package com.quest.thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor implements Runnable{
    private String file;

    public FileProcessor(String file){
        this.file = file;
    }

  public void run(){
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String content;
            System.out.println("Read file: " + file);
            while ((content = bf.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + ": " + content);
            }
            System.out.println("complete readfile: " + file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }



