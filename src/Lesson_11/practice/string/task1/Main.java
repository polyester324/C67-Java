package Lesson_11.practice.string.task1;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // task1
        System.out.println("first" + "second");
        System.out.println("first".concat("second"));
        // task2
        System.out.println("hello".equals("hello"));
        System.out.println("hello".equalsIgnoreCase("hELlo"));
        // task3
        System.out.println("hello".substring(3));
        // task4
        System.out.println("hello".length());
        // task5
        System.out.println("hello".indexOf("l"));
        // task6
        String str = String.valueOf(true);
        // task7
        System.out.println("hello".toUpperCase());
        // task8
        System.out.println("fggr1111".replace("1","%"));
        // task9
        System.out.println("    rrr    ".trim());
        // task10
        System.out.println("".isEmpty());
        // task11
        System.out.println(Arrays.toString("hello world how are u?".split(" ")));
    }
}
