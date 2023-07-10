package Lesson_20.homework.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, -57, 2, -15, -7, 55, 9, -6, 3, 64, -23, 76, -70, 645, 32, -536, 757, -969, 46, -78, 0, 345, 53,};
        Thread insertionSort = new Thread(() -> {
            int j;
            for (int i = 1; i < numberArray.length; i++) {
                int swap = numberArray[i];
                for (j = i; j > 0 && swap < numberArray[j - 1]; j--) {
                    numberArray[j] = numberArray[j - 1];
                }
                numberArray[j] = swap;
            }
            System.out.println(Thread.currentThread() + Arrays.toString(numberArray));
        });
        Thread selectionSort = new Thread(() -> {
            for (int i = 0; i < numberArray.length; i++) {
                int pos = i;
                int min = numberArray[i];
                for (int j = i + 1; j < numberArray.length; j++) {
                    if (numberArray[j] < min) {
                        pos = j;
                        min = numberArray[j];
                    }
                }
                numberArray[pos] = numberArray[i];
                numberArray[i] = min;
            }
            System.out.println(Thread.currentThread() + Arrays.toString(numberArray));
        });
        Thread bubbleSort = new Thread(() -> {
            for (int i = 0; i < numberArray.length - 1; i++) {
                for(int j = 0; j < numberArray.length - i - 1; j++) {
                    if(numberArray[j + 1] < numberArray[j]) {
                        int swap = numberArray[j];
                        numberArray[j] = numberArray[j + 1];
                        numberArray[j + 1] = swap;
                    }
                }
            }
            System.out.println(Thread.currentThread() + Arrays.toString(numberArray));
        });
        insertionSort.start();
        selectionSort.start();
        bubbleSort.start();
        System.out.println(Arrays.toString(numberArray));
    }
}
