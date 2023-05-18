package Lesson_8.Polymorphism.Task;

public class Triangle extends Shape{
    @Override
    void erase() {
        System.out.println("I erase triangle");
    }

    @Override
    void draw() {
        System.out.println("Drawing triangle");
    }
}
