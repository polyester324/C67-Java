package Lesson_8.Final;

public class Developer {
    public final int AGE; // инициализироать поле final можно здесь, в конструкторе, или в статическом блоке
    public Developer(int age){
        this.AGE = age;
    }
    // методы с final нельзя будет переопределять
    // класс с final запрещает наследование
}
