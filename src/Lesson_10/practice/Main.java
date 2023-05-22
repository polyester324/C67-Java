package Lesson_10.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
    }
}
