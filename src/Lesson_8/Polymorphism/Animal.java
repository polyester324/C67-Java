package Lesson_8.Polymorphism;

public class Animal {
    // перегрузка методов
    void makeSound(){
        System.out.println("From Animal");
    }
    void makeSound(String sound){
        System.out.println("With String line: " + sound);
    }

    void makeSound(int count){
        System.out.println("With another type: " + count);
    }
    // одна точка входа но разные реализации
    // одно название, но в зависимости от того что будет в параметрах или не будет, будет соответствующий метод
    // перегрузка именно в пределах одного класса
    // полиморфизм = перегрузка + переопределение
    // спецификация метода - имя метода и его параметры

    // переопределение

}
