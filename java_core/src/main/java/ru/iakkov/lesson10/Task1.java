package ru.iakkov.lesson10;

public class Task1 {
    public static void main(String[] args) {
        String smiles = ":) :) :) :( :( :( :) :) :) :( :) :( :)";

        System.out.println(replace(smiles));

    }
    public static String replace(String string) {
        return string.replace(":(", ":)");
    }
}
