package Lesson_9.practice.AbstractClasses;

public class Orange extends Fruit{
    @Override
    void describeTaste() {
        System.out.println("mmmmmm");
    }

    public Orange(int cost){
        super(cost);
    }
}
