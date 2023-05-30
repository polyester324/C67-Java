package Lesson_11.homework.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Enter " + array.length + " strings: ");
        if (scanner.hasNext()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.next();
            }
            String shortest = array[0], longest = array[0];
            for (int i = 0; i < array.length; i++){
                if(shortest.length() >= array[i].length()){
                    shortest = array[i];
                }
                if(longest.length() <= array[i].length()){
                    longest= array[i];
                }
            }
            System.out.println("The longest string: " + longest);
            System.out.println("The shortest string: " + shortest);
        }else {
            System.out.println("Incorrect input");
        }
    }
}
