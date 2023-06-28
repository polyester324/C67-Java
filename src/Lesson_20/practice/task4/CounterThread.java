package Lesson_20.practice.task4;

public class CounterThread implements Runnable{
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        synchronized (counter){ // монитор
            counter.setCount(1);
            for (int i = 0; i < 4; i++) {
                System.out.println(counter.getCount());
                counter.increase();
            }
        }
    }
}
