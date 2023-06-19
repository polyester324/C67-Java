package Lesson_16.practice.CollectionQueue;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        /*PriorityQueue<String> queue =new PriorityQueue<>();
        queue.add("first");
        queue.add("second");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue); // FIFO first in first out
        queue.add("zwef");
        System.out.println(queue); // сортирует элементы*/
        ArrayDeque<String> deque = new ArrayDeque<>();
        // FIFO
        deque.add("B");
        deque.add("A");
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        // LIFO
        deque.add("B");
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
