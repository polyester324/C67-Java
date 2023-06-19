package Lesson_17.practice.Lambda;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
       /* IFunctional firstLambda = new IFunctional() {
            @Override
            public long sum(int a, int b) {
                return 0;
            }
        };*/
        IFunctional firstLambda = (int a , int b) -> a+b;
        long result = firstLambda.sum(10,20);
        System.out.println(result);
        Predicate<Integer> pr = (number) -> number % 2 == 0; // принимает значение, возвращает булеан
        System.out.println(pr.test(23));
        Consumer<Integer> cl = (a) -> System.out.println(a); //  принимает значение, но не возвращает результата
        //Consumer<Integer> cl = System.out::println;  // ссылка на метод
        Supplier<Integer> sp = () -> { // либо идем в базу за параметрами. Либо сканер
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        };
        System.out.println(sp.get());
        //Function<String,Integer> function = (a) -> Integer.parseInt(a);
        Function<String,Integer> function = Integer::parseInt;
        System.out.println(function.apply("77"));
    }
}
