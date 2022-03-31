package com.company;

import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("src/com/company/textFile2.txt");
            String data = "Second Random Message";
            byte[] array = data.getBytes();
            fos.write(array);
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
