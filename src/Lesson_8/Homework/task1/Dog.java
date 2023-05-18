package Lesson_8.Homework.task1;

public class Dog extends Animal{
    @Override
    void voice() {
        System.out.println("Dog barks");
    }

    @Override
    void eat(String food) {
        System.out.println(food.equals("Meat") ? "Dog likes " + food : "Dog isn't happy with " + food);
    }
}
