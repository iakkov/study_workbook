package ru.iakkov.lesson10;

public class Task2 {
    public static void main(String[] args) {
        String newString = "я кушаю йогурт, потому что я кушаю йогурт";
        System.out.println(startsWith(newString, "я кушаю йогурт"));
    }
    public static boolean startsWith(String string, String word) {
        if (string.startsWith(word) && string.endsWith(word)) {
            return true;
        } else return false;
    }
}
