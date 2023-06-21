package Lesson_18.practice.Optional.task;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Sasha");
        Optional<User> userOptional = Optional.ofNullable(user1);
        System.out.println(userOptional.map(user -> user.name).orElse("DEFAULT"));
    }
}
