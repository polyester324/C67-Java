package Lesson_17.homework.task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, -3, -56, 87, -5, 32, -6, 8, 9, -7, 545, -45};
        Predicate<Integer> predicate = integer -> integer > 0;
        for (int value : arr){
            if (predicate.test(value)){
                System.out.print(value + " ");
            }
        }
    }
}