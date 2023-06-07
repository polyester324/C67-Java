package Lesson_13.practice.myExeption;

public class MyFirstException extends Exception{
    private String info;

    public MyFirstException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "MyFirstException{" +
                "info='" + info + '\'' +
                '}';
    }
}
