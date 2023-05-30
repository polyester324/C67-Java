package Lesson_11.homework.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Enter " + array.length + " strings: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.next();
            }
        Arrays.sort(array, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(array));
    }
}
