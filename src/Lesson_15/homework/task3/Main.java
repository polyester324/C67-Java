package Lesson_15.homework.task3;

public class Main {
    public static void main(String[] args) {
        Student.getList().add(new Student("Peter",162901,2,5));
        Student.getList().add(new Student("Rick",162901,2,2));
        Student.getList().add(new Student("Sam",162901,2,10));
        Student.getList().add(new Student("Vladimir",162901,2,7));
        Student.getList().add(new Student("Oly",162901,2,3));
        Student.getList().add(new Student("Lilya",162901,2,1));
        Student.remove();
        Student.printStudents(Student.getList(), 3);
    }
}
