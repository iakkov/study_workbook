package ru.iakkov.otus.Collections;


import java.util.HashSet;

//Set - это множество уникальных элементов. Технически это Map с постоянным значением, но разными ключами
public class DemoSet {
    public static void main(String[] args) {
        Cat murza = new Cat("Мурзик", "серый", 2);
        Cat murzaSpy = new Cat("Мурзик", "серый", 2);
        Cat vasy = new Cat("Василий", "чёрный", 3);
        Cat dymka = new Cat("Дымка", "белая", 1);

        HashSet<Cat> cats = new HashSet<>();
        cats.add(murza);
        cats.add(murzaSpy);
        cats.add(murza);
        cats.add(murza);
        cats.add(vasy);
        cats.add(dymka);
        for (Cat cat : cats) {
            System.out.println(cat.getInfo());
        }
    }
}
