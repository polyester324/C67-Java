package Lesson_15.practice.Generics;

import Lesson_8.Static.Task.Person;

public class Main {
    public static void main(String[] args) {
        GenericsExample<Integer> value1= new GenericsExample<>();
        GenericsExample<Person> value2= new GenericsExample<>();
        System.out.println(GenericsExample.hashSum(value1, value2));
    }
}
