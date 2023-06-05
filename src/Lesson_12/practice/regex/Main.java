package Lesson_12.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String line = "Hello 222from 888798group -67!";
        // regex - шаблон
        // regex выражения состоят из двух частей
        String pattern1 = "\\d{2}"; // что ищем, сколько ищем, ибо в скобках, либо в спец символах
        // можно искать буквы - "[A-z]"
        // {3} - сколько ищем
        // {5,6} - от [5 ; 6}
        // {5,} - от 5 до бесконечности
        // ? - 1 или отсутствует
        // * - сколько угодно раз
        // + -  или больше раз
        // левая часть
        // [abnjdc] - можно написать что угодно
        // ^abc - любой кроме перечисленных
        // \\d - цифровой символ (экранировать - доп слеш)
        // \\D - все что кроме цифр
        // \\s - пробелы
        // . - все что угодно
        System.out.println(line.replaceAll(pattern1,"FOUND!"));
        // ^ - в начале строки
        // $ - в конце строки
        System.out.println("Hello\tworld"); // табуляция, будто нажали tab
        // есть в 2 класса работающих с regex
        // pattern and matcher
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(line);
        // то что подходит под паттерн называется группой
        while (matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }


    }
}
