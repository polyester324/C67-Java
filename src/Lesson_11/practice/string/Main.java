package Lesson_11.practice.string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // нельзя менять строки, только досоздавать новые
        /*String str = "hello";
        System.out.println(str+" world");*/
        String line = "Group 67!";
        System.out.println(line.length());
        System.out.println("Hello".length()); // длина
        // метод trim, strip - убирают лишние пробелы
        System.out.println("    r r    rg g     ".trim());
        System.out.println("    r r    rg g     ".strip());
        System.out.println("   ккк    ".stripLeading());//убирает пробелы слева
        System.out.println("   ккк    ".stripTrailing());//убирает пробелы справа
        // достать определенный символ - charAt
        System.out.println("hello".charAt(0)); // символ по индексу
        // обратный метод (нахождение индекса по символу первого вхождения)
        System.out.println("hello".indexOf("l")); // выведет только 1 индекс
        // метод concat
        System.out.println("hello ".concat("world"));// суммирует строки
        System.out.println("hello " + "world");// одно и тоже
        // substring - вырезает часть строки
        System.out.println("hello".substring(3));// все что от 3 - распечатает
        System.out.println("hello".substring(1,3));// распечатает символы (1;3) индексов
        // сторки можно сравнивать через ==, можно через equals
        System.out.println(line.equals("hello")); // equals возвращает true/false
        // есть метод compareTo - взвращает не true/false, а если true - 0; если false - другое число
        System.out.println("gioe1".compareTo("gioe1"));
        // toUpperCase - все символы в верхний регистр
        // toLowerCase - все символы в нижний регистр
        System.out.println("fgRHrHGhrGHRtRG".toLowerCase());
        System.out.println("fgRHrHGhrGHRtRG".toUpperCase());
        // есть equals который игнорирует регистр
        System.out.println("Erf".equalsIgnoreCase("ERF"));
        // replace
        System.out.println(line.replace(",","."));//
        // replaceAll - принимает регулярные выражения
        System.out.println(line.replaceAll("[0-9]{2}","3"));
        // преобразование строки в байт
        System.out.println(Arrays.toString(line.getBytes()));
        // разбитие строки на массив символов
        System.out.println(Arrays.toString(line.toCharArray()));
        System.out.println(Arrays.toString(line.split(" "))); // позволяет разделить строку по заданному делителю
        System.out.println(line.startsWith("Group"));
        System.out.println(line.endsWith("6"));
        System.out.println(line.contains("67"));
        System.out.println(" ".isBlank()); // проверяет на наличие символов, пробелы не счиатет
        System.out.println(" ".isEmpty()); // проверяет ли пустая строка, количество сиволов = 0 - true
        System.out.println(line.repeat(3)); // распечатает строку указанное количество раз
        // строки хранятся в специальной области String Pool и находится это в Heap
        // когда мы добавляет строку она добавляется в String Pool
        // при запуске sout("hello" + "world") то в String Pool будет три строки
        // но если в String Pool уже есть строка, то создавая такую же он просто возьмет ссылку на существующую
        // если мы хотим создать строку просто в heap
        // то нужно создать строку как объект
        // String string = new String();
        // если создать объекты строк,  сравнить через equals, то все хорошо его переопределять не нужно
        // но если сравним через == объекты String, то сравнивать будут ссылки
        String simpleLine = "Hello";
        String string = new String("Hello");
        simpleLine = line.intern(); // перекладывает объект из Heap в String Pool
        System.out.println(simpleLine == string);
        String block = """
                Hello world!
                How are u?
                """; // используется редко
        System.out.println(block);
        // если к строке добавляем что-то, то это сразу преобразуется в строку
        System.out.println(line + 2);
        String six = String.valueOf(6); // из цифр в строки
        String bl = String.valueOf(true); // из boolean в строки
    }
}
