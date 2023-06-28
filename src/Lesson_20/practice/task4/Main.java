package Lesson_20.practice.task4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new CounterThread(counter));
            thread.start();
            //thread.join();
        }
    }
}
