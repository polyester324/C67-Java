package Lesson_15.practice.Collections.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Set в отличие от list не хранит дубликатов
        // 3 основные реализации - hashSet, TreeSet, LinkedHashSet
        // hashSet - работает на хэш таблица
        // + hashSet - быстрый поиск по хэшкоду
        // Хранит уникальные элементы, хаотично все сохраняет, хаотично все добавляет
        HashSet<String> hList= new HashSet<>();
        hList.add("hello");
        hList.add("world");
        hList.add("group");
        hList.add("group");
        hList.add("67");
        System.out.println(hList);
        // LinkedHashSet - последовательность добавления сохраняется
        // TreeSet - все сортирует, цифры от меньшего к большему, слова по буквам
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("erfer");
        treeSet.add("efsr");
        treeSet.add("efef");
        /*System.out.println(treeSet.floor(6));
        System.out.println(treeSet.ceiling(2)); */
        //treeSet.stream().sorted(Comparator.comparing(String::length));

    }
}
