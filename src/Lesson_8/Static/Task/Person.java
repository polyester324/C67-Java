package Lesson_8.Static.Task;

public class Person {
    public static final String NAME;
    static {
        NAME = "Sasha";
    }
    static void showNAME(){
        System.out.println("Name: " + NAME);
    }
}
