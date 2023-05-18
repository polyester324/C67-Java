package Lesson_8.Static;

public class Main {
    public static void main(String[] args) {
        // static - спецификатор
        // часть кода помеченная static
        Developer developer_1 = new Developer();
        Developer developer_2 = new Developer();
        developer_1.name = "Sasha"; // поле принадлежит объекту
        developer_2.name = "Dimas";
        // статичное поле принадлежит классу
        // и его нельзя увидеть у объекта
        System.out.println(Developer.salary); // просамтриваем статик поле через класс
        Developer.salary = 2000;
        // статичную переменную еще называют глобальной
        Developer.sayHello();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        // разница статического блока от логического в том что статический блок запустится 1 раз при создании объекта
        // логичнский конструктор каждый раз при создании объекта
        System.out.println(Developer.Laptop.name);
    }
}
