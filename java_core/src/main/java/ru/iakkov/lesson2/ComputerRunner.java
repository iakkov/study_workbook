package ru.iakkov.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.load();
        System.out.println("RAM: " + computer.ram);
        System.out.println("SSD: " + computer.ssd);
    }
}
