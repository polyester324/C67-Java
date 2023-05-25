package Lesson_10.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object house = new House();
        Object scanner = new Scanner(System.in);
        // toString() - преобразовать объект в строку
        House house1 = new House();
        house1.setCost(1000_000);
        house1.setColor("Red");
        System.out.println(house1.toString());
        // hashCode
        House house2 = new House();
        house1.setCost(1200_000);
        house1.setColor("Black");
        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        // коллизия - совпадение хешкодов,
        // может быть из-за большего количсетва объектов чем хешкодов
        // или если формула перегружена
        // можно переопределить hashCode()
        // собес
        // если бы у вас была задача написать свою формулу хэшкода
        // ответ: максимально разбросать значения по инту
        // взять значения хешкода полей
        // умножить на простые числа типо 17, 31

        // equals
        // сравнивает объекты между собой
        System.out.println(house1.equals(house2));
        // по умолчанию equals сравнивает ссылки объектов
        // память в джава делится на 2 группы
        // стек и куча(heap)
        // new выделяет память в хэпе
        // стек хранит в себе последовательность вызова методов, примитивы и  ссылки на объекты
        // House house1 = new House(); всегда отрабатывается первым то что справа
        // объекты можно описать в одну ссылку: house1 = house2;
        // переопределяем метод чтобы сравнивать не ссылки а значения полей объектов
        // у equals и хэшкода есть контракт
        // потому что есть коллекции которые для работы используют методы выше
        // и если один переопределен а другой нет, то работа будет не правильна
        // разницы между == и equals(до переопределения) нет
        // метод clone()
        // редко используется, полностью клонирует 1 объект в другой
        // для клонирования нужен интерфейс маркер
        // метод clone нежно переопределить
        house1.setDog(new Dog("Misha"));
        House newHouse = (House) house1.clone(); // Object -> House явное преобразование
        System.out.println(newHouse.getColor());
        //newHouse.setDog("Sasha");
        System.out.println(newHouse.getDog());
        // нужно делать глубокое клонирование иначе если у объекта в полях есть ссылки на другие объекты, они  будут повторяться
        // при глубоком клонировании все классы должны имплементировать Cloneable
        // getClass - метод получения мето данных класса к которому применяем !!!!!!
        System.out.println(house1.getClass()); // используется в рефлексии
        Class metaInfo = house1.getClass(); // лежит вся информация о классе House
        Class[] interfaces = metaInfo.getInterfaces();
        for (Class classInterface : interfaces) {
            System.out.println(classInterface.getName());
        } // рефлексия

        // метод finalize
        // heap забивается объекты под капотом
        // heap хранит не только объекты java, но и фреймворков и др
        // Сборщик мусора Garbage Collector (GC)
        // foreach у себя под капотом использует итератор
        // когда массив пройдет GC удалит этот итератор
        // метод finalize описывал какие объекты он удалит, но это не прижилось
        // GC работает хаотически
        System.gc(); // не вызывает метод, а рекоммендует ему отработать


    }
}
