package Lesson_11.practice.stringBuilderstringBuffer.task1;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("hello world");
        stringBuilder.append("xxxx");
        stringBuilder.insert(5,"y");
        stringBuilder.delete(3,6);
        stringBuilder.reverse();
        String str =stringBuilder.toString();
        System.out.println(str);
    }
}
