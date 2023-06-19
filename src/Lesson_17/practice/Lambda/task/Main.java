package Lesson_17.practice.Lambda.task;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a , b) -> {
            if (a > b) {
                return a;
            } else if (a < b) {
                return b;
            }else {
                return 0;
            }
        };
        System.out.println(binaryOperator.apply(2, 5));
    }
}
