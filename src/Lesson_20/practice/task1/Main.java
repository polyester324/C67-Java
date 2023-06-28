package Lesson_20.practice.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начинает свою работу");
        MyThread child = new MyThread();
        child.start();
        child.join();// тот кто порождает поток должен дождаться его завершения
        //child.join(100);// подождет 100 милисекунд и начнет работу
        System.out.println("Поток main завершает свою работу");
    }
}
