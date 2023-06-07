package Lesson_14.practice.IOstream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\newFile.txt");
        String text = "Hello from group 67! Привет привет";
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(text.getBytes());
        outputStream.flush();// сохранить изменения, и заставляет записать
        outputStream.write("\nHi".getBytes());
        //outputStream.close(); - если не закрыть то может быть утечка информации
        // сохраняем байты в файл
        int i;
        FileInputStream fileInputStream = new FileInputStream(file);
        while ((i = fileInputStream.read()) != -1){ // работай пока там что-то есть, при отсутствии выдает -1
            System.out.print((char) i);
        }
        fileInputStream.close(); // закрытие потока обязательно
        System.out.println();
        // сделаем то же самое символами
        FileReader fr = new FileReader(file);
        int k;
        while ((k=fr.read()) != -1){
            System.out.print((char) k);
        }
        fr.close();
        // writer будет отличаться
        // try-with-resources - не использует close; поток закрывается автоматически
        try (FileWriter fw = new FileWriter(file, true)){ // true означает что мы не стираем информацию, написанную в file ранее
            fw.write("\nHello again");
            fw.flush(); // без него информация будет записывать только после окончания потока
            fw.write("\nour group is the best");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
