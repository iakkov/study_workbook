package ru.iakov.algorithms;

import java.util.LinkedList;
import java.util.List;

/*
Implement a stack with an additional method that allows you to quickly
get the maximum element at any stage of insertion and deletion operations.

The stack supports three main methods:
* push(int number) — add an element,
* pop() — remove the top element,
* getMax() — return the maximum element.

In this case, each operation must be performed in constant time.
 */
public class MyStack {

    List<Integer> list = new LinkedList<>();
    List<Integer> maxListInTheMoment = new LinkedList<>();

    public void push(int number) {
        list.addFirst(number);

        if (maxListInTheMoment.isEmpty()) {
            maxListInTheMoment.addFirst(number);
        } else if (number > maxListInTheMoment.getFirst()) {
            maxListInTheMoment.addFirst(number);
        } else {
            maxListInTheMoment.addFirst(maxListInTheMoment.getFirst());
        }
    }

    public int pop() {
        maxListInTheMoment.removeFirst();
        return list.removeFirst();
    }

    public int getMax() {
        return maxListInTheMoment.getFirst();
    }
}
