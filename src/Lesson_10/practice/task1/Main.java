package Lesson_10.practice.task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Misha", 34, 7880.4, new Cat("Barsik"));
        Person person2 = (Person) person1.clone();
        person2.setName("Sasha");
        System.out.println(person1.equals(person2));
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person2.hashCode()); // hashCode МОЖЕТ БЫТЬ ОТРИЦАТЕЛЬНЫМ
    }
}
