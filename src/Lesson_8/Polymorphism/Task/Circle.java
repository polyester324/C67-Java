package Lesson_8.Polymorphism.Task;

public class Circle extends Shape{
    @Override
    void erase() {
        System.out.println("I erase circle");
    }

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}
