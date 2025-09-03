package ru.iakov.algorithms;

import java.util.List;

/*
Write a method that returns the second-largest element from a given list of integers.
If the list is less than two elements long, an IllegalStateException is thrown.
The method must be implemented in an efficient way, traversing the list only once.
 */

public class SecondMaxNumber {
    public static void main(String[] args) {

        List<Integer> list = List.of(100);
        System.out.println(findSecondMaxNumber(list));

    }

    public static int findSecondMaxNumber(List<Integer> list)  {
        if (list.size() < 2) {
            throw new IllegalStateException();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : list) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax) {
                secondMax = number;
            }
        }
        return secondMax;
    }
}
