package Lesson_20.homework.task1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i] = scanner.nextInt();
            }
        }else {
            System.out.println("Incorrect input. Must be Integer");
            scanner.next();
        }
        Thread t1 = new Thread(){
            @Override
            public void run() {
                //int max = Arrays.stream(arrayInt).max();
            }
        };

    }
}
