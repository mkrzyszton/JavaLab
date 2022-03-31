package com.company;

import java.sql.Array;

public class Main {

    public static void main(String[] args) {

        int[] _array = { 4, 5, 7, 11, 12, 15, 15, 21, 40, 45 };
        double _index = searchIndex(_array, 11);

        System.out.println(Math.round(_index));
    }

    public static double searchIndex(int[] array, int value) {
        double index = 0;
        double limit = array.length - 1;
        while (index <= limit) {
            double point = Math.ceil((index + limit) / 2);
            double entry = array[(int) point];
            if (value > entry) {
                index = point + 1;
                continue;
            }
            if (value < entry) {
                limit = point - 1;
                continue;
            }
            return point;
        }
        return -1;
    }
}
