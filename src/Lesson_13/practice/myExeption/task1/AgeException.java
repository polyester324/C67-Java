package Lesson_13.practice.myExeption.task1;

public class AgeException extends Exception{
    int a;
    public AgeException(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Age exception: " + a + " is under 18!";
    }
}
