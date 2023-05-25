package Lesson_10.homework.taskAdditional;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User(1, 4829840, new Laptop("Hp"));
        User user2 = new User(2, 8788640, new Laptop("Huawei"));
        User userCloned1 = (User) user1.clone();
        User userCloned2 = (User) user2.clone();
        System.out.println(user1 + "\n" + userCloned1);
        System.out.println(user2 + "\n" + userCloned2);
        userCloned1.getLaptop().setName("Lenovo");
        userCloned2.getLaptop().setName("Mac");
        System.out.println();
        System.out.println(user1 + "\n" + userCloned1);
        System.out.println(user2 + "\n" + userCloned2);
    }
}
