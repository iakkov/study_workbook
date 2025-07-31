package ru.iakkov.algorithms;

import java.util.Scanner;

public class ABCTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        long result = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') {
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[j] == 'b') {
                        for (int k = j + 1; k < charArray.length; k++) {
                            if (charArray[k] == 'c') {
                                result++;
                            }
                        }
                    }
                }
            }

        }
        System.out.println(result);
    }
}

