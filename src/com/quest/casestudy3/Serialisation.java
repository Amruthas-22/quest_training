package com.quest.casestudy3;

import java.io.*;
import java.util.List;
import java.util.Map;

public class Serialisation {
    public static void serializeServiceData(Map<Customer, List<ServiceBooking>> serviceData, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(serviceData);
            System.out.println("Service data serialized to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Customer, List<ServiceBooking>> deserializeServiceData(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Map<Customer, List<ServiceBooking>> data = (Map<Customer, List<ServiceBooking>>) ois.readObject();
            System.out.println("Service data deserialized from " + fileName);
            return data;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
}
}

