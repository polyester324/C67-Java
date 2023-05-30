package Lesson_11.homework.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();
        String doubledString ="";
        for (int i = 0; i < string.length(); i++) {
            doubledString = doubledString.concat(string.charAt(i) + "" +string.charAt(i));
        }
        System.out.println(doubledString);
    }
}
