package ru.iakov.stream.task1;

import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

/*
Задача 1. Расшифровать и вывести в одну строку, разделенную запятыми. Алгоритм шифрования Base 64 (Streams)
 */
public class Main {
    public static void main(String[] args) {
        // Условие
        List<List<String>> lists = List.of(List.of("SGUXMTExbC8tM6xvMyEyMy4uL1v", "dzBvcjFsZA=="),
                List.of("aM4=", "dGgxMTExMyMyaXM="),
                List.of("YmVhdXQxMyNpZjMxMnVs", "ZGF5"));

        // Решение
        String result = lists.stream()
                .flatMap(List::stream)
                .map(Base64.getDecoder()::decode)
                .map(String::new)
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
