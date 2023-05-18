package Lesson_8.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        animal.makeSound("Woo");
        animal.makeSound(12);
        Animal wolf = new Wolf();
        wolf.makeSound(); // если бы у волка не было этого метода, он бы взялся из родительского класса
    }
}
