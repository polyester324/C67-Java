package Lesson_17.homework.task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<StringBuilder> supplier = () -> {
            StringBuilder build = new StringBuilder(new Scanner(System.in).nextLine());
            return build.reverse();
        };
        System.out.println(supplier.get());
    }
}