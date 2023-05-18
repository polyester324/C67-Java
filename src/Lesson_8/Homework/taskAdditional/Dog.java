package Lesson_8.Homework.taskAdditional;

public class Dog{
    private Dog() { // конструктор с модификатором private не позволяет создавать объект в других классах
    }

    static void voice() { // запуск статического метода осуществляется без создания объекта
        System.out.println("Dog barks");
    }

    static void eat(String food) {
        System.out.println(food.equals("Meat") ? "Dog likes " + food : "Dog isn't happy with " + food);
    }
}
