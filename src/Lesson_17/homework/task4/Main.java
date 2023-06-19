package Lesson_17.homework.task4;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        String str = "2.98 BYN";
        Consumer<String> consumer = (string) -> System.out.println(Double.parseDouble(string.replaceAll(" BYN", "")) / 2.98 + " USD");
        consumer.accept(str);
    }
}