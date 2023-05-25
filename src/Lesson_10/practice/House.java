package Lesson_10.practice;

import java.io.Serializable;
import java.util.Objects;

public class House implements Cloneable, Serializable { // мы не видим но класс наследуется от Object
    private int cost;
    private String color;
    private Dog dog;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return cost == house.cost && Objects.equals(color, house.color);
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        House house = (House) super.clone();
        house.dog = (Dog) dog.clone();
        return house;

    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, color);
    }

    @Override
    public String toString() {
        return "house: cost = " + cost + " , color = " + color;
    }

    //@Override
    /*protected void finalize() throws Throwable {
        super.finalize();  // уже не используется
    }*/
}
