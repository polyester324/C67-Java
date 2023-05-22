package Lesson_9.practice.Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstInterface.WHEELS_COUNT);
        /*BMW bmw = new BMW();
        Lada lada = new Lada();*/
        // интерфейсная сслыка
        FirstInterface car1 = new BMW();
        FirstInterface car2 = new Lada();
        car1.stop();
        car2.signal();
    }
}
