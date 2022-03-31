package com.company;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/com/company/textFile.txt");
            int i = 0;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
