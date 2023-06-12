package Lesson_15.practice.Collections.List.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("US");
        list.addFirst("UK");
        list.addLast("Belarus");
        list.addLast("Poland");
        list.removeFirst();
        list.removeLast();
        list.getFirst();
        list.getLast();
    }
}
