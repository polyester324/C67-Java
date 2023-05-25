package Lesson_10.homework.task1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(162901, "Sasha214", "qwerty");
        User user2 = new User(162901, "Sasha214", "qwerty");
        User user3 = new User(162902, "Sasha214", "qwerty");
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));
    }
}
