package Lesson_13.practice.myExeption.task1;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws AgeException {
        Person person1 = new Person(16);
        try {
            if (person1.getAge()<18){
                throw new AgeException(person1.getAge());
            }
        } catch (AgeException e){
            System.out.println(e);
        }
    }
}
