package ru.iakkov.lesson3;

public class Computer2 {
    int ssd = 500;
    int ram = 1024;

    Computer2() {
        System.out.println("Я был создан");
    }
    Computer2(int newSsd) {
        ssd = newSsd;
    }
    void load() {
        System.out.println("Я загрузился");
    }
}
