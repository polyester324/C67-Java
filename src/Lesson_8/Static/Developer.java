package Lesson_8.Static;

public class Developer {
    String name;
    public static String example;
    static int salary = 1000; // static field
    // статичные переменные часто делают final
    // можно записывать переменные в статические поля
    // использовалось раньше для экономии памяти
    static {
        example = "Hello"; // в статическом блоке инициализируются статические поля
        // в логическом блоке любые
    }
    public final static double PI = 3.14;
    // статические методы внутри себя могут использовать только статические переменные
    // суть статического блока в том что он отработает перед конструктором
    static{
        System.out.println("Hello from logic block Developer");
    }
    static void sayHello(){ // не передаются объектам
        System.out.println("Hello!");
        System.out.println(PI);
    }
    // вопрос с собеса что за чем выполняется
    // сначала статический потом логические , статический 1 раз отрабатывает при создании объекта

    // статические классы почти не используются
    static class Laptop{ // поля и методы только статические
        static String name = "HP";
    }
}
