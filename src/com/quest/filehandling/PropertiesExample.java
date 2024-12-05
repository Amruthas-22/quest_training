package com.quest.filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("db.url", "jdbc:oracle:thin:@localhost:1521:xe");
        prop.setProperty("db.user", "scott");
        prop.setProperty("db.password", "tiger");

        FileOutputStream fos = null;
        try {

            fos = new FileOutputStream("config.properties");
            prop.store(fos, "Database Configuration");
            System.out.println("Properties written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Properties prop2 = new Properties();
        try (FileInputStream in = new FileInputStream("config.properties")) {
            prop2.load(in);
            System.out.println("Properties read successfully:");
            System.out.println("db.url: " + prop2.getProperty("db.url"));
            System.out.println("db.user: " + prop2.getProperty("db.user"));
            System.out.println("db.password: " + prop2.getProperty("db.password"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
