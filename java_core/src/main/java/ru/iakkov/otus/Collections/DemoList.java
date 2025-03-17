package ru.iakkov.otus.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

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
            System.out.println(cat.getInfo());
        }
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        ////
        System.out.println("----LinkedList----");
        LinkedList<Cat> linkedList = new LinkedList<>();
        linkedList.add(murza);
        linkedList.add(vasy);
        linkedList.add(dymka);

        for(Cat cat : linkedList) {
            System.out.println(cat.getInfo());
        }

        System.out.println("----добавили кота в 'стакан'----");
        linkedList.push(new Cat("Барсик", "пепельный", 5));
        for (Cat cat : linkedList) {
            System.out.println(cat.getInfo());
        }

        Cat catPop = linkedList.pop();
        System.out.println("---- забрали кота из 'стакана': " + catPop.getInfo() + " -----");

        System.out.println("----добавили кота в 'очередь'-----");
        linkedList.offer(new Cat("Мурка", "рыжая", 4));
        for (Cat cat : linkedList) {
            System.out.println(cat.getInfo()
            );
        }

        Cat catPoll = linkedList.poll();
        System.out.println("----забрали кота из 'очереди': " + catPoll.getInfo() + "-----");
        for (Cat cat : linkedList) {
            System.out.println(cat.getInfo());
        }
    }
}
