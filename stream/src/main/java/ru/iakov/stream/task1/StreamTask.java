package ru.iakov.stream.task1;

import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

/*
Decrypt and output in one line, separated by commas. Base 64 encryption algorithm (Streams)
 */
public class StreamTask {
    public static void main(String[] args) {
        // List
        List<List<String>> lists = List.of(List.of("SGUXMTExbC8tM6xvMyEyMy4uL1v", "dzBvcjFsZA=="),
                List.of("aM4=", "dGgxMTExMyMyaXM="),
                List.of("YmVhdXQxMyNpZjMxMnVs", "ZGF5"));

        // Solution
        String result = lists.stream()
                .flatMap(List::stream)
                .map(Base64.getDecoder()::decode)
                .map(String::new)
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
