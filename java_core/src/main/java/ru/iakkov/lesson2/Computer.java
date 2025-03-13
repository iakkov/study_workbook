package ru.iakkov.lesson2;

public class Computer {
    int ssd = 500;
    int ram = 1024;
    private static int counter = 0;

    void load() {
        System.out.println("Я загрузился");
    }

    public Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
        counter++;
    }
    int getCounter() {
        return counter;
    }
}
