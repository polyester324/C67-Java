package Lesson_8.Homework.task1;

public class Tiger extends Animal{
    @Override
    void voice() {
        System.out.println("Tiger roars");
    }

    @Override
    void eat(String food) {
        System.out.println(food.equals("Meat") ? "Tiger likes " + food : "Tiger isn't happy with " + food);
    }
}
