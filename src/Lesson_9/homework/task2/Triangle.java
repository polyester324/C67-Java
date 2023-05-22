package Lesson_9.homework.task2;

public class Triangle extends Shape{
    private double a, b, c;

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    double square() {
        return 0;
    }

    double perimeter() {
        return a + b + c;
    }
}
