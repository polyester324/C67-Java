package Lesson_20.practice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       /* System.out.println(Thread.currentThread());
        MyFirstThread mft = new MyFirstThread();
        mft.start();*/
        /*Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("My thread");
            }
        };
        t.start();
        t.setName("c67 - thread");
        //t.setPriority(10); // чем выше тем главнее
        //System.out.println(t.getId());
        System.out.println(t);*/
        // создание через интерфейс
        /*Thread thread = new Thread(new MySecondThread());
        thread.start();*/
        MyFirstThread mft = new MyFirstThread();
        //mft.start();
        // isAlive проверяет состояние потока
        //System.out.println(mft.isAlive()); // true/false
        // прерывание потоков
        //mft.interrupt();
        //mft.isInterrupted();
        // внутри потока есть булеан флаг
        // interrupt переводит эту переменную в тру - поток остановлен, но не остановит поток
        // isInterrupted показывает значение этой переменной
        // но по факту метод поток не остановит, а просто поменяет значение булиан переменной
        // у потока который interrupted нельзя применять методы, иначе будет ошибка InterruptedException
        /*InterruptTest interruptTest = new InterruptTest();
        interruptTest.start();
        Thread.sleep(10000);
        interruptTest.interrupt();*/
        // потоки делающие обслуживающую информацию
        // можно описать их как потоки демоны, т е их завершения программа ждать не будет
        // потоки демоны - неосновные потоки
        mft.setDaemon(true); // поток демон обязательно указать перред стартом
        mft.start();
        Thread.sleep(100);
    }
}
