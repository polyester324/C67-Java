package Lesson_13.homework.taskAdditional;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str = "123";
        int n = Integer.parseInt(str);
    }
}
