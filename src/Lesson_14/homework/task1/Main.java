package Lesson_14.homework.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\course\\C67-Java\\src\\Lesson_14\\homework\\task1\\romeo-and-juliet.txt");
        FileReader fr = new FileReader(file);
        int i;
        String longestWord = "";
        StringBuilder newLine = new StringBuilder();
        while ((i = fr.read()) != -1) {
            newLine.append((char) i );
            //if (longestWord.length()<fr.read(i));
        }
        fr.close();
    }
}
