package Lesson_13.homework.task1;

public class WrongPasswordException extends Exception{
    private String info;
    public WrongPasswordException() {
    }
    public WrongPasswordException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "info='" + info + '\'' +
                '}';
    }
}
