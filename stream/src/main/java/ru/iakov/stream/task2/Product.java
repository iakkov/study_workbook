package ru.iakov.stream.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*
Class for the task
 */
@Getter
@Setter
@AllArgsConstructor
class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;
}
