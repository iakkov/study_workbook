package ru.iakkov.otus.Collections;

import java.util.Objects;

public class Cat {
    private String name;
    private String color;
    private int wight;

    public Cat(String name, String color, int wight) {
        Objects.requireNonNull(name, "name can not be null");
        this.name = name;
        this.color = color;
        this.wight = wight;
    }

    public String getName() {return name;}
    public String getColor() {return color;}
    public int getWight() {return wight;}
    public void setWight(int wight) {this.wight = wight;}
}
