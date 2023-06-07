package Lesson_13.homework.task1;

import java.util.Scanner;

public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public static boolean enter(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Incorrect login");
        }
        if (!password.matches("[0-9]") || password.contains(" ") || !password.equals(confirmPassword) || password.length() > 20) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }

    public static void main(String[] args) {
        User user1 = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        user1.setLogin(scanner.nextLine());
        System.out.println("Enter password: ");
        user1.setPassword(scanner.nextLine());
        System.out.println("Enter confirm password: ");
        user1.setConfirmPassword(scanner.nextLine());
        try{
            System.out.println(User.enter(user1.getLogin(), user1.getPassword(), user1.getConfirmPassword()));
        }catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e);
        }
    }
}
