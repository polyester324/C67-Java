package Lesson_11.practice.stringBuilderstringBuffer;

public class Main {
    public static void main(String[] args) {
        // в отличие от стринга сильно экономят память
        // позволяют изменять
        StringBuilder stringBuilder = new StringBuilder("Hello world");
        System.out.println(stringBuilder.append("this is end of line")); // добавляет строку, без создания новой. экономия памяти
        System.out.println(stringBuilder.delete(4,7));
        System.out.println(stringBuilder.deleteCharAt(7)); // удалить 1 символ
        System.out.println(stringBuilder);// сохраняет изменения предыдущего метода
        stringBuilder.insert(3, "BYE"); // дабавление в середину по индексу
        System.out.println(stringBuilder.reverse());// отзеркаливает строку
        // нельзя сравнивать stringbuilder and string  это разные классы
        String string = stringBuilder.toString(); // преобразует stringbuilder в string
        // у stringbuilder and stringbuffer одинокавые методы
        // stringbuffer - используется в многопоточности
        StringBuffer stringBuffer = new StringBuffer("eeeeeeeeeeeeee");
    }
}
