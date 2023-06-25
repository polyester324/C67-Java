package Lesson_18.homework.taskAdditional;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Harry");
        map.put(2, "Oliver");
        map.put(3, "Charlie");
        map.put(4, "Thomas");
        map.put(5, "Jack");
        map.put(6, "Jacob");
        map.put(7, "Alfie");
        map.put(8, "Riley");
        map.put(9, "William");
        map.put(10, "James");
        map.put(11, "Amelia");
        map.put(12, "Olivia");
        map.put(13, "Emily");
        List<String> list = map.keySet().stream()
                .filter(integer -> integer == 1 || integer == 2 || integer == 5 || integer == 8 || integer == 9 || integer == 13)
                .map(integer -> map.get(integer))
                .filter(s -> s.length() % 2 != 0)
                .map(s ->  new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(list);
    }
}