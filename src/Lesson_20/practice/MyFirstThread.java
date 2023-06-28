package Lesson_20.practice;

public class MyFirstThread extends Thread{
    @Override
    public void run() { // не путать с методом start
        // все что тут положим, будет выполняться потоком
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        /*try {
            sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e);
        }*/

    }
}
