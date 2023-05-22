package Lesson_9.practice.AbstractClasses;

public abstract class Fruit {
    // значит что класс не может создавать объект
    // еще может иметь абстрактные методы
    // можем описывать и обычные мметоды
    private int cost;
    public void sayHello(){
        System.out.println("Hello");
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Fruit(int cost){
        this.cost = cost;
    }
    // абстрактный
    abstract void describeTaste();
    // абстактные метода необходимо реализовать дочерним,
    // при условии что дочерние классыне абстрактны
}
