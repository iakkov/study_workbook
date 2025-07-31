package ru.iakkov.blockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                test.produce();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                test.consume();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
