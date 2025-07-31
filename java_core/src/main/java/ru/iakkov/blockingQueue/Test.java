package ru.iakkov.blockingQueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public void produce() {
        Random random = new Random(100);

        while(true) {
            try {
                queue.put(random.nextInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consume() {
        while(true) {
            try {
                Thread.sleep(100);
                System.out.println(queue.take());
                System.out.println("Queue size is " + queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
