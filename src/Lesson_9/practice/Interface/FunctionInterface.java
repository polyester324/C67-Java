package Lesson_9.practice.Interface;

@FunctionalInterface  // аннотация ставится над интерфейсом с одним абстрактым методом
public interface FunctionInterface {
    // функциональный интерфейс, интерфейс с одним абстрактным методом
    int shouldBeOneMethod();
    // но можно использовать дефолтные и статические методы
}
