package Lesson_13.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) {
        // подключение к бд
        // исключения - классы, объекты которых создаются в исключающей ситуации
        // в вершине наследования исключений стоит Throwable
        // try/catch блок
        int number = 0;
        try {
            System.out.println(10 / number);
        } catch (ArithmeticException exception){ // можно писать Throwable, но лучше указывать конкретную ошибку
            System.out.println("some ArithmeticException exception " + exception);
        } catch (RuntimeException exception){
            System.out.println("some RuntimeException exception " + exception.getMessage());
        }
        /*catch (ArithmeticException | StackOverflowError){}*/
        // ошибка обработается, и программа не остановится
        // несколько ошибок можно обработать мультиобработчиком
        // try/catch блоки можно вкладывать друг в друга
        // finally - блок который выполнится всегда и при ошибке и при ее отсутствии
        // код в блоке try который идет после ошибки не выполняется
        // поэтому используется блок finally
        finally {
            System.out.println(111111);
        }
        // какой интерфейс используется под капотом try with resources - Autocloseable
        // try with resources позволяет избежать использование блока finally
        // есть проверяемые и непроверяемые исключения
        // в проверяемых исключениях на этапе написания кодаИДЕЯ не даст запустить программу без обработки исключения
        try {
            FileInputStream s = new FileInputStream("D:\\file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
