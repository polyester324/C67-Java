package Lesson_17.homework.task3;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String str = "2.98 BYN";
        Function<String, Double> function = (string) -> Double.parseDouble(string.replaceAll(" BYN", "")) / 2.98;
        System.out.println(function.apply(str) + " USD");
    }
}