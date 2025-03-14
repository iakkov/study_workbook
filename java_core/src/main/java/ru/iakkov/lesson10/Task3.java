package ru.iakkov.lesson10;

public class Task3 {
    public static void main(String[] args) {
        String fullName = "иванов иван Иванович";
        System.out.println(initials(fullName));
    }
    public static String initials(String fullName) {
        String[] tokens = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        initials.append(tokens[0].charAt(0) + "." + tokens[1].charAt(0) +
                "." + tokens[2].charAt(0) + ".");
        // return initials.toString().toUpperCase();
        return String.format("%s.%s.%s.", tokens[0].charAt(0), tokens[1].charAt(0), tokens[2].charAt(0)).toUpperCase();
    }
}
