package Lesson_8.Homework.taskAdditional;

public class Dog{
    private Dog() {
    }

    static void voice() {
        System.out.println("Dog barks");
    }

    static void eat(String food) {
        System.out.println(food.equals("Meat") ? "Dog likes " + food : "Dog isn't happy with " + food);
    }
}
