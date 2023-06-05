package Lesson_12.homework.taskAdditional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Number of document: 0000-3743-34; +(29)99305994151-3743-35" +
                " username@domain.com email tmsnanana@gmail.com; phone number: +(29)1234567";
        Pattern patternDocumentNumber = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher matcherDocumentNumber = patternDocumentNumber.matcher(str);
        Pattern patternEmail = Pattern.compile("([a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+)");
        Matcher matcherEmail = patternEmail.matcher(str);
        Pattern patternPhoneNumber = Pattern.compile("([+][(]\\d{2}[)]\\d{7})");
        Matcher matcherPhoneNumber = patternPhoneNumber.matcher(str);
        while (matcherDocumentNumber.find()){
            System.out.println("document number: " + matcherDocumentNumber.group());
        }
        while (matcherEmail.find()){
            System.out.println("email: " + matcherEmail.group());
        }
        while (matcherPhoneNumber.find()){
            System.out.println("phone number: " + matcherPhoneNumber.group());
        }
    }
}
