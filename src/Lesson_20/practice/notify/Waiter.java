package Lesson_20.practice.notify;

public class Waiter extends Thread{
    private final Monitor monitor;

    public Waiter(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {

        synchronized (monitor) {
            System.out.println("Начал работу в Waiter: " + Thread.currentThread());
            try {
                monitor.wait(); // освобождает монитор и переходит в ожидание
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Завершил работу в Waiter: " + Thread.currentThread());
        }
    }

}
