package Lesson_12.practice.regex.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*String str = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        String strNull = "null";
        Pattern pattern1 = Pattern.compile("^null$");
        Matcher matcher = pattern1.matcher(strNull);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println(matcher.matches());*/
        /*String str2 = "rtbdgbb t5g45g g fg";
        System.out.println(str2.replaceAll("[A-z]", "&"));*/
        String str = "Hello \n world \n !!!";
        Pattern pattern1 = Pattern.compile("\n");
        Matcher matcher = pattern1.matcher(str);
        String result = matcher.replaceAll("");
        System.out.println(result);
        String str2 = "Всем привет!! Меня зовут Билл Гейтс " +
                "и я мечтаю учиться в TeachMeSkills";
        Pattern pattern3 = Pattern.compile("[А-Я][а-я]+ [А-Я][а-я]+");
        Matcher matcher3 = pattern3.matcher(str2);
        while (matcher3.find()){
            System.out.println(matcher3.group());
        }
    }
}
