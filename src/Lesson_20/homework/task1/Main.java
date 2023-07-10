package Lesson_20.homework.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = new int[4];
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i] = scanner.nextInt();
            }
            Thread t1 = new Thread(() -> {
                var max = Arrays.stream(arrayInt).max();
                System.out.println(max);
            });
            Thread t2 = new Thread(() -> {
                var min = Arrays.stream(arrayInt).min();
                System.out.println(min);
            });
            t1.start();
            t2.start();
        }else {
            System.out.println("Incorrect input. Must be Integer");
        }
    }
}