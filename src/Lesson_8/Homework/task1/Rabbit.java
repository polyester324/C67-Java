package Lesson_8.Homework.task1;

public class Rabbit extends Animal{
    @Override
    void voice() {
        System.out.println("Rabbit squeaks");
    }

    @Override
    void eat(String food) {
        System.out.println(food.equals("Grass") ? "Rabbit likes " + food : "Rabbit isn't happy with " + food);
    }
}
