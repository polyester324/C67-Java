package Lesson_11.homework.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String string1 = scanner.toString();
            scanner.next();
            String string2 = scanner.toString();
            scanner.next();
            String string3 = scanner.toString();
            scanner.next();
        } else {
            System.out.println("Incorrect input");
        }

    }
}
