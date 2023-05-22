package Lesson_9.practice.Interface;

public interface FirstInterface {
    // список методов без реализации
    // все метода public
    // методов может быть любое количество, даже 0
    // в интерфейсах могут быть и поля
    // НЕЛЬЗЯ СОЗДАВАТЬ ОБЪЕКТЫ!!

    int WHEELS_COUNT = 4; // поля по умолчанию public final static
    // ctrl + shift + U сделать слово капсом
    static void start(){ // статичные методы переопределить нельзя
        System.out.println("Start");
    }
    // абстрактные методы
    void stop();
    // default - описание метода
    default void signal(){ // можно не переопределять дефолтные методы
        System.out.println("Some sound");
        privateMethod();
    };

    void changeSpeed(int speed); // методы должны переопределяться, но не перегружаться
    private void privateMethod(){
        System.out.println("This is private method");
        // используются в дефолтных методах
    }
    // интерфейс - маркеры
    // интерфейсы у которых нет методов
    // используются для того чтобы пометить классы
    // Clonеable - позволяет кланировать объекты
}
