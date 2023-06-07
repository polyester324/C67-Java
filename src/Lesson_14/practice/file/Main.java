package Lesson_14.practice.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //File file = new File("D:\\newFile.txt");
        //File file = new File("D:\\newFile"); // если без расширения то он будет считать что это  папка
        File file = new File("D:\\");
        //boolean result = file.createNewFile();
        boolean result = file.mkdir(); // создает папку
        /*System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());*/
        System.out.println(result); // в 1 раз выдаст true, а потом будет выдавать false, потому что файл уже будет создан
        if (file.isFile()){
            System.out.println("It's file");
        }else if (file.isDirectory()){
            System.out.println("Some folder");
        }
        File[] allFiles = file.listFiles();
        System.out.println(Arrays.toString(allFiles));
        // папки или файлы можно удалять
        //file.delete();
    }
}
