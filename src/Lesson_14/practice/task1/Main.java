package Lesson_14.practice.task1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\newFileNew.txt");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(text.replace(" ","_").getBytes());
        outputStream.flush();
        outputStream.close();
        int i;
        FileInputStream fileInputStream = new FileInputStream(file);
        while ((i = fileInputStream.read()) != -1){
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
}
