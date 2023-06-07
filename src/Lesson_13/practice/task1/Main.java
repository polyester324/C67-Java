package Lesson_13.practice.task1;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {2, 4, 6, 8, 3, 2, 5, 3, 5, 6, 5};
        try {
            System.out.println(arrayInt[88]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
    }
}
