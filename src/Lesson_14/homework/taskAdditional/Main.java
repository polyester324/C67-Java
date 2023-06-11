package Lesson_14.homework.taskAdditional;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.next());           // src\\Lesson_14\\homework\\taskAdditional\\docNumber.txt
        File validFileReport = new File("src\\Lesson_14\\homework\\taskAdditional\\validFileReport.txt");
        File invalidFileReport = new File("src\\Lesson_14\\homework\\taskAdditional\\invalidFileReport.txt");
        try (FileReader fr = new FileReader(file)){
            int i;
            StringBuilder newLine = new StringBuilder();
            while ((i = fr.read()) != -1){
                newLine.append((char) i );
            }
            String[] result = newLine.toString().split("\n");
            for (String s : result) {
                if ((s.matches("docnum[^_]\\w[^_]+") || s.matches("contract[^_]\\w[^_]+")) && s.trim().length() == 15) {
                    try (FileWriter fw = new FileWriter(validFileReport, true)) {
                        fw.write(s);
                    } catch (RuntimeException | IOException e) {
                        System.out.println("IOException " + e);
                    }
                } else {
                    try (FileWriter fw = new FileWriter(invalidFileReport, true)) {
                        fw.write(s);
                    } catch (RuntimeException | IOException e) {
                        System.out.println("IOException " + e);
                    }
                }
            }
            System.out.println("Document numbers were classified");
        }catch (RuntimeException | IOException e){
            System.out.println("Exception is found " + e);
        }
    }
}
