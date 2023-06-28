package Lesson_19.practice;

import Lesson_8.Homework.task1.Dog;

public class Main {
    public static void main(String[] args) {
        //String.join();
        // JavaFX , Swing
        Object d = new Dog();
        System.out.println(d instanceof Lesson_8.Homework.task1.Animal);
        Object d2 = new Dog();
        if (d2 instanceof Lesson_8.Homework.task1.Animal){
            Dog dog = (Dog) d2;
        }
    }
}
