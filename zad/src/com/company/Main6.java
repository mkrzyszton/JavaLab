package com.company;

import java.util.Spliterator;

public class Main {

    public static void main(String[] args) {

        String text = "line 1\r\n" +
                      "line 2\n" +
                      "line 3";

        String[] lines = text.split("/\r\n|\n\r|\n|\r/" );

        String[] numbers = text.split("[0-9]");
        int sum = 0;

        for (String line: lines) {
            System.out.println(line);
        }

        for (String number: numbers) {
            sum += Integer.parseInt(number);
            System.out.println(sum);
        }
    }
}
