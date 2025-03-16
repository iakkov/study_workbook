package ru.iakkov.otus.Collections;

import java.util.ArrayList;

public class DemoList {
    public static void main(String[] args) {
        Cat murza = new Cat("Мурзик", "серый", 2);
        Cat vasy = new Cat("Василий", "чёрный", 3);
        Cat dymka = new Cat("Дымка", "белая", 1);

        System.out.println("----ArrayList----");
        ArrayList<Cat> arrayList = new ArrayList<>();
        arrayList.add(murza);
        arrayList.add(vasy);
        arrayList.add(dymka);

        for (Cat cat : arrayList) {
            System.out.println(cat);
        }
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
    }
}
