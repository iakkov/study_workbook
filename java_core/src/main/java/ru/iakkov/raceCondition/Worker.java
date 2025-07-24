package ru.iakkov.raceCondition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    Object lock1 = new Object();
    Object lock2 = new Object();

    public void addToList1() {
        synchronized(lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized(lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }

        long timeAfter = System.currentTimeMillis();

        System.out.println("Time: " + (timeAfter - timeBefore));
        System.out.println("First ArrayList has size: " + list1.size());
        System.out.println("Second ArrayList has size: " + list2.size());
    }

}
