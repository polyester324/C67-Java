package Lesson_10.practice.task1;

import java.util.Date;
import java.util.Objects;

public class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String name;
    private int age;
    private double salary;
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Person(String name, int age, double salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", " + cat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.salary, salary) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return (int) (31*name.hashCode()* cat.hashCode()*(new Date().getTime()));
    }
}
