package Lesson_17.practice.DateTime.task;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 6,19);
        System.out.println(date1.plusWeeks(1).getDayOfWeek());
        LocalDate date2 = LocalDate.now();
        do {
            date2 = date2.plusDays(1);
        }while (!date2.getDayOfWeek().equals(DayOfWeek.TUESDAY));
        System.out.println(date2);
    }
}