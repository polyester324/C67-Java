package Lesson_11.homework.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Enter " + array.length + " strings: ");
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        for (String string : array) {
            for (int j = 0; j < string.length() - 1; j++) {
                for (int k = j + 1; k < string.length() - 1; k++) {
                    if (string.charAt(j) != string.charAt(k)) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println("Unique word " + string);
                break;
            }
        }
    }
}
