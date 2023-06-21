package Lesson_18.practice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // создание стримов
        // через of
        Stream.of(1,2,3,4,5,1,34,534,545,345,32); // делаем так если данных немного, принимает объекты
        // самый частый через коллекции и массивы
        ArrayList<String> list = new ArrayList<>();
        list.stream();
        int[] arr = {2,23,5,63,23,56};
        //System.out.println(Arrays.stream(arr).max());
        // на созданном стриме мы можем применять методы
        // конвеерные методы
        //filter - predicate отбор, true - проходит, false - нет
        Stream.of(10, 20, 31, 40, 50)
                .filter(number -> number > 25)
                .filter(number2 -> number2 % 2 == 0)
                .map(n -> n + " USD") // преобразует
                .forEach(System.out::println);
        Arrays.stream(arr)
                .skip(2) // первые 2 элемента пропустит
                .distinct() // удаляет дубликаты
                .peek(Main::someMethod) // выполняет наши методы
                .forEach(value -> System.out.println(value));

        Optional<String> opt;
        Stream.of("1 0", "2 0", "3 1", "4 0", "5 0")
        //Set<String> opt = Stream.of("1 0", "2 0", "3 1", "4 0", "5 0")
        //Set<String> opt = Stream.of("1 0", "2 0", "3 1", "4 0", "5 0")
                .sorted()
                .flatMap(a -> Arrays.stream(a.split(" "))) // из 1 элемента может создавать несколько.
                .forEach(s -> System.out.print(s + " "));
                //.forEachOrdered(s -> System.out.print(s + " "));
                //.min(Integer::compare);
                //.max(Integer::compare);
                //.toArray(String[]::new);
        //.findFirst();
                //.findAny()
                //.collect(Collectors.toSet());
                //.count();
                //.allMatch(s -> s.length()>1);
        //System.out.println(opt);
        //это все были конвеерные методы
        //...........................
        // терминальные методы
        //.forEach(s -> System.out.print(s + " "));
        //.findFirst(); нужно сохранять в переменную Optional
        //.findAny();
    }

    static int someMethod (int x){
        return x;
    }
}
