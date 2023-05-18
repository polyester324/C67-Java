package Lesson_8.Polymorphism.Task;

public class Square extends Shape{
    @Override
    void erase() {
        System.out.println("I erase square");
    }

    @Override
    void draw() {
        System.out.println("Drawing square");
    }
}
