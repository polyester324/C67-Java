package Lesson_10.homework.taskAdditional;

public class Laptop implements Cloneable{
    private String name;

    public Laptop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                '}';
    }
}
