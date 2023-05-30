package Lesson_11.practice.stringBuilderstringBuffer.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int n = scanner.nextInt();
        System.out.println("Enter array");
        int[] array = new int[n];
        for (int i = 0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(i!=array[i]){
                System.out.println("missed number " + i);
                break;
            }
            if (i==array.length -1){ // костыль -нехорошо
                System.out.println("missed number " + (i + 1));
            }
        }
    }
}
