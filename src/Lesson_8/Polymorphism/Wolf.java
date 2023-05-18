package Lesson_8.Polymorphism;

public class Wolf extends Animal{
    // переопределение всегда про наследование
    void makeSound() { // это написано вручную
        System.out.println("From Wolf"); // переопределили
    }

    @Override // аннотация
    void makeSound(String sound) { // это написано через code -> override methods
        super.makeSound(sound);
    }
}
