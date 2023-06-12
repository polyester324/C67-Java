package Lesson_15.practice.Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // arrayList и linkedList
        // можем обращаться к элементам по индексу
        // ArrayList - класс
        ArrayList<String> list = new ArrayList<>();
        // под капотом у него обычный массив, но если массив закончится то он сохранит все из старого массива в новый более широкий
        // в ArrayList очень быстро достаются элементы O[1]
        // если не указать <String> то в листе будут объекты класса Object
        // при создании листа по дефолту создается массив из 10 элементов
        // как только все 10 ячеек заполнятся создаться новый размером  1.5 +1
        list.add("hello");
        list.add("world");
        list.add("67");
        list.add("group");
        list.add("67");
        System.out.println(list); // коллекции можно печатать напрямую
        // в листах элементы могут дублироваться
        System.out.println(list.get(3)); // если взять несуществующий индекс выкинет ошибку как в массивах
        System.out.println(list.size());
        // addAll позволяет одну коллекцию скопировать в другую
        System.out.println(list.contains("group"));
        System.out.println(list.indexOf("hello"));
        System.out.println(list.isEmpty());
        System.out.println(list.remove("67")); // удалит первый который встретит
        System.out.println(list.set(3, "67")); // удалит первый который встретит
        String[] arr = list.toArray(new String[0]);
        // ArrayList - динамический массив
        /*ArrayList<String> listnew = new ArrayList<>() {{
            //add.("sdfasf");
        }};*/
        // linkedList - двусвязный список
        LinkedList<String> linkList = new LinkedList<>();
        // когда мы создаем linkedList, то создается Node
        // в котором хранятся 2 ссылки - next, previous
        // ранит элементы в порядке добавления и дубликаты тоже
        linkList.add("one");
        linkList.addFirst("hello");
        linkList.addLast("hello");
        System.out.println(linkList);
        /*linkList.removeFirst("hello");
        linkList.removeLast("hello");*/
        // у листов
        linkList.peek();
        linkList.poll();
        linkList.pop();
    }
}
