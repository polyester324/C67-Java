package Lesson_9.homework.task2;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    double square() {
        return 3.14 * Math.pow(radius, 2);
    }
}
