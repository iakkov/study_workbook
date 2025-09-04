package ru.iakov.stream.task2;

import java.util.List;

/*
Find the average price of all products
Find the most expensive product in the "Electronics" category
Group products by category with a total cost
Find products with a quantity less than 10 and a price higher than 200.0
 */

public class StreamTask {
    public static void main(String[] args) {
        // List
        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 1500.0, 5),
                new Product("Smartphone", "Electronics", 800.0, 10),
                new Product("Desk", "Furniture", 300.0, 8),
                new Product("Chair", "Furniture", 120.0, 15),
                new Product("Monitor", "Electronics", 400.0, 7)
        );

        // Solution
        double result = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
                System.out.println("Средняя цена: " + result);

    }
}