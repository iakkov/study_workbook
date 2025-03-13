package ru.iakkov.lesson2;

import javax.script.Compilable;

public class ComputerRunner {
    public static void main(String[] args) {
        /* Computer computer = new Computer();
        computer.load();
        System.out.println("RAM: " + computer.ram);
        System.out.println("SSD: " + computer.ssd);
        */
        Computer computer1 = new Computer(500, 1024);
        Computer computer2 = new Computer(600, 2048);
        System.out.println(computer1.getCounter());
        System.out.println(computer2.getCounter());
    }
}
