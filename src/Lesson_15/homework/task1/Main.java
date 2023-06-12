package Lesson_15.homework.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arrayString = str.split(" ");
        Set<String> hashSet = new HashSet<>(Arrays.asList(arrayString));
        System.out.println(hashSet);
    }
}
