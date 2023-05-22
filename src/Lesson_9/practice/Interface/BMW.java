package Lesson_9.practice.Interface;

public class BMW implements FirstInterface, SecondInterface, FunctionInterface{ // имплементируем интерфейсы
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void stop() {
        System.out.println("BMW stops moving");
    }

    @Override
    public void signal() {
        System.out.println("BIP BIP");
    }

    @Override
    public void changeSpeed(int speed) {
        setSpeed(getSpeed() + speed);
    }

    @Override
    public void makeSound() {
        System.out.println("Music sounds");
    }

    @Override
    public int shouldBeOneMethod() {
        return 0;
    }
}
