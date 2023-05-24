package Lesson_9.homework.task2;

public class Rectangle extends Shape{
    private double a, b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    double square() {
        return a * b;
    }

    @Override
    double perimeter() {
        return (a + b) * 2;
    }
}
