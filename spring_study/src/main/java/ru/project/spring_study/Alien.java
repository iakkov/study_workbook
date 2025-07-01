package ru.project.spring_study;

public class Alien {
    private int age;
    private Computer computer;

    public Alien() {
        System.out.println("Alien created...");
    }
    public void code() {
        System.out.println("I'm coding...");
        computer.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
