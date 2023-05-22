package Lesson_10.practice;

public class House { // мы не видим но класс наследуется от Object
    private int cost;
    private String color;

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
    public String toString() {
        return "house: cost = " + cost + " , color = " + color;
    }
}
