package Lesson_14.practice.serialize;

import java.io.*;

public class Main implements Serializable {
    String name;
    // transient String password = null;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // преобразовываем объекты в байты
        // сериализация нужна для того чтобы сохранить объекты
        // это позволяет продлить жизнь объектов
        Main main1 = new Main();
        Main main2 = new Main();
        main1.name = "Main1";
        main2.name = "Main2";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\main.txt"));
        outputStream.writeObject(main1);
        outputStream.writeObject(main2);
        outputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\main.txt"));
        Main main1restored = (Main) objectInputStream.readObject();
        Main main2restored = (Main) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(main1restored.name);
        System.out.println(main2restored.name);
    }
}
