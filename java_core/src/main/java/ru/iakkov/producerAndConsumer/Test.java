package ru.iakkov.producerAndConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

}

class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private Object lock = new Object();
    private final int LIMIT = 10;

    public void produce() throws InterruptedException {
        int value = 0;
    }

    public void consume() throws InterruptedException {

    }
}
