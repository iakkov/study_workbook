package ru.iakkov.lesson10;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String value = "1234567890";
        int n = 3;
        String[] result = split(value, n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] split(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            result[counter] = value.substring(i, i + n);
            counter++;
        }
        return result;
    }
}
