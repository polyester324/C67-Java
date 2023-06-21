package Lesson_18.practice.Optional;

import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // контейнер для значений, обертка значения которое будет приходить
        // принимает значение или null и оборачивает его
        // создание
        Optional<Object> firstOptional =  Optional.empty(); // создаем пустой Optional, как коробку, обертку
        // empty используется как заглушка, но чаще используем Optional.of если уверены, что там не null
        Optional<String> secondOptional = Optional.of("secondOptional");
        Optional<String> thirdOptional = Optional.ofNullable("thirdOptional"); // проверка на null
        // если там null то создаст пустой Optional, если есть значение то обернет его
        // Check is empty
        System.out.println(firstOptional.isEmpty()); // возвращает true если пустой
        System.out.println(firstOptional.isPresent()); // возвращает true если в нем что-то есть
        // можем выполнять методы
        // run some code
        secondOptional.ifPresent(l -> System.out.println(l)); // если бы в переменной не было значения метод бы не сработал
        // open Optional
        // если в коробке что-то есть вернет значение, если нет, то вернет то, что мы в скобках указываем
        String result = thirdOptional.orElse("DEFAULT_VALUE");
        String result2 = thirdOptional.orElseGet(() -> { // принимает на вход лямбду supplier
            return "DEFAULT_VALUE";
        });
        // можно не делать никаких проверок и получить содержимое, но это не хорошо
        String result3 = thirdOptional.get();
        String result4 = thirdOptional.orElseThrow(); // кинь ошибку дефолтную, если null
        String result5 = thirdOptional.orElseThrow(() -> new RuntimeException()); // кинь свою ошибку, если null
        Optional<Integer> number = Optional.of(2016);
        //number.filter(integer -> integer == 2016);
        System.out.println(number.filter(integer -> integer == 2016)); // если true - Optional[2016], если false - Optional.empty
        //map используется если мы хотим изменить то что находится внутри Optional
        int size = thirdOptional.map(s -> s.length()).orElse(0); // принимает на вход Function
        System.out.println(size);
    }
}
