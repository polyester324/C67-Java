package Lesson_15.practice.Generics;

import java.util.List;

public class GenericsExample <T/*, T2*/>{
    private T value;
    /*private T2 valueT2;*/
    public List<?> list;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> Integer hashSum(T...objects){
        int sum = 0;
        for (T o : objects) {
            sum = sum + o.hashCode();
        }
        return sum;
    }
}
