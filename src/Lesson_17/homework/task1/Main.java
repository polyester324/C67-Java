package Lesson_17.homework.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate dateUser1 = LocalDate.parse(new Scanner(System.in).nextLine());
        System.out.println(dateUser1.plusYears(100));
    }
}
