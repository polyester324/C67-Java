package Lesson_15.homework.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class MyList {
    private LinkedList<String> list = new LinkedList<>(Arrays.asList("Tiger", "Wolf"));

    public LinkedList<String> getList() {
        return list;
    }

    public void setList(LinkedList<String> list) {
        this.list = list;
    }

    public void add(String str){
        list.addLast(str);
    }

    public void remove(){
        list.removeFirst();
    }
}