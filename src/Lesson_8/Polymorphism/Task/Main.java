package Lesson_8.Polymorphism.Task;

public class Main {
    public static void main(String[] args) {
        Shape shape_1 = new Circle();
        Shape shape_2 = new Square();
        Shape shape_3 = new Triangle();
        shape_1.draw();
        shape_2.draw();
        shape_3.draw();
    }
}
