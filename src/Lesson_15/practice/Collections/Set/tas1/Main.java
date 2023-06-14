package Lesson_15.practice.Collections.Set.tas1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> list = new HashSet<>();
        Person pr1 = new Person("Oleg");
        Person pr2 = new Person("Vity");
        Person pr3 = new Person("Sasha");
        list.add(pr1);
        list.add(pr2);
        list.add(pr3);
        for (Person pr : list) {
            System.out.println(pr);
        }
        list.remove(pr2);
        list.remove(pr3);
        for (Person pr : list) {
            System.out.println(pr);
        }
    }
}
