package Lesson_17.practice.DateTime;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        /*LocalDate date = LocalDate.now(); // сегодняшняя дата
        System.out.println(date);*/
        System.out.println(LocalDate.now());
        LocalDate date1 = LocalDate.of(1890,2,2);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2033-01-01"); // удобно если даты приходят извне в файле например
        System.out.println(date2.plusDays(10));
        date2 = date2.plusMonths(22);
        /*System.out.println(date2.plusYears(10));*/
        System.out.println(date2.minusDays(10));
        date2 = date2.minus(1, ChronoUnit.MILLENNIA);
        System.out.println(date2);
        System.out.println(date2.getDayOfMonth());
        System.out.println(date2.getDayOfWeek());
        System.out.println(date2.isLeapYear()); // проверка на високосный год
        System.out.println(date2.isAfter(date1));
        System.out.println(LocalDate.MAX);
        //.............................................................
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // по умолчанию время на компе, но если программа запустится в другом часовом поясе то она будет подстраиваться под другой комп
        LocalDate date5 = LocalDate.now();
        System.out.println(date5.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        System.out.println(date5);
    }
}