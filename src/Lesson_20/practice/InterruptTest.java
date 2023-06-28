package Lesson_20.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InterruptTest extends Thread{
    @Override
    public void run() {
        while (!isInterrupted()){
            System.out.println("Thread is working " + LocalDateTime.now());
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
                interrupt();
            }
        }
        System.out.println(" Thread is closing");
    }
}
