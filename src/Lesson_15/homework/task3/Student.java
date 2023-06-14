package Lesson_15.homework.task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private int grade;
    private static List<Student> list = new ArrayList<>();

    public static List<Student> getList() {
        return list;
    }

    public static void setList(List<Student> list) {
        Student.list = list;
    }

    public Student(String name, int group, int course, int grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public static void remove(){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).grade < 3) {
                list.remove(i);
                i--;
            } else {
                list.get(i).course = list.get(i).course + 1;
            }
        }
    }

    public static void printStudents(List<Student> students, int course){
        for (Student st:students){
            if (st.course == course){
                System.out.println(st.name + " course: " + st.course);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}
