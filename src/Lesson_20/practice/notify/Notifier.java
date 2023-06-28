package Lesson_20.practice.notify;

public class Notifier extends Thread{
    private Monitor monitor;

    public Notifier(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        System.out.println("Начал работу в Notifier: " + Thread.currentThread());
        synchronized (monitor) {
            monitor.notify(); // возобновляет работу потока который отпустил этот монитор
            //monitor.notifyAll(); // если нужно возобновить все потоки
        }
        System.out.println("Завершил работу в Notifier: " + Thread.currentThread());
    }
}
