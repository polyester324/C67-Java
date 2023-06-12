package Lesson_15.practice.Collections.List.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listCountries = new ArrayList<>();
        listCountries.add("Belarus");
        listCountries.add("USA");
        listCountries.add("UK");
        System.out.println(listCountries);
        listCountries.set(1, "Poland");
        listCountries.remove(1);
        listCountries.remove("UK");
        System.out.println(listCountries.indexOf("Belarus"));
        System.out.println(listCountries.contains("Belarus"));
    }
}
